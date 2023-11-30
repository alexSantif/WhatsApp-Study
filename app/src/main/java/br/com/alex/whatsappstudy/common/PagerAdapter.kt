package br.com.alex.whatsappstudy.common

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.alex.whatsappstudy.presentation.calls.CallsFragment
import br.com.alex.whatsappstudy.presentation.chatlist.ChatListFragment
import br.com.alex.whatsappstudy.presentation.communities.CommunitiesFragment
import br.com.alex.whatsappstudy.presentation.status.StatusFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val tabFragmentsList = listOf(
        CommunitiesFragment(),
        ChatListFragment(),
        StatusFragment(),
        CallsFragment()
    )

    override fun getItemCount(): Int {
        return tabFragmentsList.size
    }

    override fun createFragment(position: Int): Fragment {
        return runCatching { tabFragmentsList[position] }.getOrThrow()
    }
}