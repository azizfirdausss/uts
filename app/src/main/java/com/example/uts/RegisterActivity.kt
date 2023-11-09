package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.uts.HomeMainActivity
import com.example.uts.R

class RegisterActivity : AppCompatActivity() {
    lateinit var button1: TextView
    lateinit var button2: ImageView
    lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        button()
    }

    private fun button() {
        button1 = findViewById(R.id.txt_login)
        button1.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
        button2 = findViewById(R.id.btn_back2)
        button2.setOnClickListener {
            startActivity(Intent(this, HomeMainActivity::class.java))
        }
        button3 = findViewById(R.id.R_btn_1)
        button3.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}