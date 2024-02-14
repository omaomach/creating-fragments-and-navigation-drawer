package com.example.creatingfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.creatingfragments.Adapter.MyAdapter

class ViewPager : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter
    private val arrayList = ArrayList<String>()
    lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        viewPager2 = findViewById(R.id.viewPager)
        myAdapter = MyAdapter(this)

        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        viewPager2.adapter = myAdapter

    }
}