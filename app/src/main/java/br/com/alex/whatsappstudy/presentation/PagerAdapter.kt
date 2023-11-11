package br.com.alex.whatsappstudy.presentation

import android.content.res.Resources.NotFoundException
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import br.com.alex.whatsappstudy.presentation.calls.CallsFragment
import br.com.alex.whatsappstudy.presentation.chatlist.ChatListFragment
import br.com.alex.whatsappstudy.presentation.status.StatusFragment

class PagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ChatListFragment()
            1 -> StatusFragment()
            2 -> CallsFragment()
            else -> { throw NotFoundException("fragment errado") }
        }
    }
}