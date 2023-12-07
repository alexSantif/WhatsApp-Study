package br.com.alex.whatsappstudy.presentation

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.widget.Toolbar
import androidx.viewpager2.widget.ViewPager2
import br.com.alex.whatsappstudy.R
import br.com.alex.whatsappstudy.common.PagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tl_tabs)
        viewPager = findViewById(R.id.vp_fragments)
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, index ->
            tab.text = when(index) {
                0 -> ""
                1 -> getString(R.string.chat_list_fragment_name)
                2 -> getString(R.string.status_fragment_name)
                3 -> getString(R.string.calls_fragment_name)
                else -> { throw Resources.NotFoundException(getString(R.string.fragment_not_found_error)) }
            }
        }.attach()
        tabLayout.setTabWidthAsWrapContent(0)
        viewPager.setCurrentItem(1, false)
    }

    fun TabLayout.setTabWidthAsWrapContent(tabPosition: Int) {
        val layout = (this.getChildAt(0) as LinearLayout).getChildAt(tabPosition) as LinearLayout
        val layoutParams = layout.layoutParams as LinearLayout.LayoutParams
        layoutParams.weight = 0f
        layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT
        layout.layoutParams = layoutParams
        this.getTabAt(0)?.setIcon(android.R.drawable.ic_menu_camera)
    }
}