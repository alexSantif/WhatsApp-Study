package br.com.alex.whatsappstudy.presentation.chatlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.alex.whatsappstudy.databinding.FragmentChatListBinding
import br.com.alex.whatsappstudy.core.BaseAdapter
import br.com.alex.whatsappstudy.presentation.chatlist.adapter.ChatListAdapter
import kotlinx.coroutines.flow.collectLatest
import org.koin.androidx.viewmodel.ext.android.viewModel

class ChatListFragment : Fragment() {

    private val chatListViewModel: ChatListViewModel by viewModel()

    private var _binding: FragmentChatListBinding? = null
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChatListBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.rvChats?.layoutManager = LinearLayoutManager(requireContext())

        chatListViewModel.getNews()
        lifecycleScope.launchWhenStarted {
            chatListViewModel.uiState.collectLatest { news ->
                binding?.rvChats?.adapter = BaseAdapter {
                    ChatListAdapter(it)
                }.apply {
                    news.data?.articles?.toMutableList()?.let {
                        this.items = it
                    }
                }
            }
        }
    }
}