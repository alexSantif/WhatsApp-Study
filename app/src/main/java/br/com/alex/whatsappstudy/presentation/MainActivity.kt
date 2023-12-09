package br.com.alex.whatsappstudy.presentation

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.common.PagerAdapter
import br.com.alex.whatsappstudy.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar)

        binding.vpFragments.adapter = PagerAdapter(this)
        TabLayoutMediator(binding.tlTabs, binding.vpFragments) { tab, index ->
            tab.text = when(index) {
                0 -> ""
                1 -> getString(R.string.chat_list_fragment_name)
                2 -> getString(R.string.status_fragment_name)
                3 -> getString(R.string.calls_fragment_name)
                else -> { throw Resources.NotFoundException(getString(R.string.fragment_not_found_error)) }
            }
        }.attach()
        binding.tlTabs.setTabWidthAsWrapContent(0)
        binding.vpFragments.setCurrentItem(1, false)
    }

    private fun TabLayout.setTabWidthAsWrapContent(tabPosition: Int) {
        val layout = (this.getChildAt(0) as LinearLayout).getChildAt(tabPosition) as LinearLayout
        val layoutParams = layout.layoutParams as LinearLayout.LayoutParams
        layoutParams.weight = 0f
        layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        layout.layoutParams = layoutParams
        this.getTabAt(0)?.setIcon(android.R.drawable.ic_menu_camera)
    }
}