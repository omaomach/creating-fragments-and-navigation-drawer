package com.example.creatingfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.creatingfragments.Adapter.TabAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class TabLayout : AppCompatActivity() {

    val tabsArray = arrayOf("Books", "Movies", "Games")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val viewPager = findViewById<ViewPager2>(R.id.view_pager_2)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)

        val adapter = TabAdapter(
            supportFragmentManager,
            lifecycle
        )

        viewPager.adapter = adapter

        // Connecting the viewpager with tab layout
        TabLayoutMediator(tabLayout, viewPager) {
            tab, position -> tab.text = tabsArray[position]
        }.attach()

    }
}