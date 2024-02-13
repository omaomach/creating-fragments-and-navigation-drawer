package com.example.creatingfragments

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var drawerLayout : DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        drawerLayout= findViewById(R.id.drawer_layout)


        button1.setOnClickListener() {
            val fragment1: Fragment = Fragment1()

            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame1, fragment1).commit()

        }

        button2.setOnClickListener() {
            val fragment2: Fragment = Fragment2()

            val fragmentTransaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame2, fragment2).commit()

        }

        toggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open,
            R.string.close
        )

        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // functionality for the nav drawer
        val navView : NavigationView = findViewById(R.id.nav_view)
        navView.setBackgroundColor(Color.RED)
        navView.setNavigationItemSelectedListener {
            it.isChecked = true
            when(it.itemId) {
                R.id.login_item -> {
                    replaceFragment(LoginFragment(), it.title.toString())
                }
                R.id.home_item -> {
                    replaceFragment(HomeFragment(), it.title.toString())
                }
                R.id.message -> {
                    replaceFragment(MessagesFragment(), it.title.toString())
                }
                R.id.settings -> {
                    replaceFragment(SettingsFragment(), it.title.toString())
                }
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment, title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout_1, fragment)
        fragmentTransaction.commit()

        drawerLayout.closeDrawers()
        setTitle(title)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return  super.onOptionsItemSelected(item)
    }

}