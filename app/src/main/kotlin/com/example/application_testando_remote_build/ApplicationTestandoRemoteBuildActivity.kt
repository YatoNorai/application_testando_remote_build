package com.example.application_testando_remote_build

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class ApplicationTestandoRemoteBuildActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        if (savedInstanceState == null) loadFragment(HomeFragment())
        navView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home          -> loadFragment(HomeFragment())
                R.id.navigation_dashboard     -> loadFragment(DashboardFragment())
                R.id.navigation_notifications -> loadFragment(NotificationsFragment())
            }
            true
        }
    }
    private fun loadFragment(f: Fragment) =
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, f).commit()
}
