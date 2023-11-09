package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.uts.LoginActivity
import com.example.uts.RegisterActivity
import com.example.uts.R

class HomeMainActivity : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_main)

        button()
    }

    private fun button() {
        button1 = findViewById(R.id.btn_1)
        button1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        button2 = findViewById(R.id.btn_2)
        button2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }


    }
}