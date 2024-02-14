package com.example.creatingfragments.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.creatingfragments.fragments.BooksFragment
import com.example.creatingfragments.fragments.GamesFragment
import com.example.creatingfragments.fragments.MoviesFragment

class TabAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3;
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return GamesFragment()
            1 -> return MoviesFragment()
            2 -> return BooksFragment()
        }
        return BooksFragment()
    }
}