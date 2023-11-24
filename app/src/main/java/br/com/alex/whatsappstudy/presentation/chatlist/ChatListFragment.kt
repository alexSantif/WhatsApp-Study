package br.com.alex.whatsappstudy.presentation.chatlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.presentation.BaseAdapter
import br.com.alex.whatsappstudy.presentation.YellowView
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.combineLatest
import org.koin.androidx.viewmodel.ext.android.viewModel

class ChatListFragment : Fragment() {

    private val chatListViewModel: ChatListViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chats, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv = view.findViewById<RecyclerView>(R.id.rv_call_test)
        rv.layoutManager = LinearLayoutManager(requireContext())

        chatListViewModel.getNews()
        lifecycleScope.launchWhenStarted {
            chatListViewModel.uiState.collectLatest { news ->
                println(">>>> " + news.data)
                rv.adapter = BaseAdapter {
                    YellowView(it)
                }.apply {
                    val noticias = news.data?.articles?.toMutableList()
                    if (noticias != null) {
                        this.items = noticias
                    }
                }
            }
        }
    }
}