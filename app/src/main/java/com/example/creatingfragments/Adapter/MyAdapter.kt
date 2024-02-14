package com.example.creatingfragments.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.creatingfragments.MainActivity
import com.example.creatingfragments.fragments.GloriaFragment
import com.example.creatingfragments.fragments.JoashFragment

class MyAdapter(mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {

    private val Fragment_Size = 2
    override fun getItemCount(): Int {
        return this.Fragment_Size
    }

    override fun createFragment(position: Int): Fragment {

        when (position) {
            0 -> {
                return JoashFragment()
            }
            1 -> {
                return GloriaFragment()
            }
        }
        return JoashFragment()
    }

}