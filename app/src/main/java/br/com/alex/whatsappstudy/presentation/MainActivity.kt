package br.com.alex.whatsappstudy.presentation

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import br.com.alex.whatsappstudy.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tl_tabs)
        viewPager = findViewById(R.id.vp_fragments)

        viewPager.adapter = PagerAdapter(this)
        TabLayoutMediator(tabLayout, viewPager) { tab, index ->
            tab.text = when(index) {
                0 -> "Conversas"
                1 -> "Atualizações"
                2 -> "Chamadas"
                else -> { throw Resources.NotFoundException("fragment errado") }
            }
        }.attach()
    }
}