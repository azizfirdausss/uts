package com.example.uts

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.uts.fragments.FCalculator
import com.example.uts.fragments.FConversion
import com.example.uts.fragments.FMenu
import com.example.uts.fragments.FMoneyconv
import com.example.uts.fragments.FProfile
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomnavmenu = findViewById<BottomNavigationView>(R.id.bottom_nav)

        loadFragment(FMenu())

        bottomnavmenu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.bot_menu_home ->{
                    loadFragment(FMenu())
                    true
                }
                R.id.bot_menu_calculator ->{
                    loadFragment(FCalculator())
                    true
                }
                R.id.bot_menu_conversion ->{
                    loadFragment(FConversion())
                    true
                }
                R.id.bot_menu_moneyconv ->{
                    loadFragment(FMoneyconv())
                    true
                }
                R.id.bot_menu_profile ->{
                    loadFragment(FProfile())
                    true
                }

                else -> {
                    false
                }

            }
        }
    }

    private fun loadFragment(fragment : Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container,fragment)
            commit()
        }
    }

    private fun loadActivity(activity : Class<out Activity>){
        val intent = Intent(this, activity)
        startActivity(intent)

    }
}