package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.uts.HomeMainActivity
import com.example.uts.MainActivity
import com.example.uts.R

class
LoginActivity : AppCompatActivity() {
    lateinit var button1: ImageView
    lateinit var button2: TextView
    lateinit var button3: Button
    lateinit var email:EditText
    lateinit var password: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        email = findViewById (R.id.edt_email) as EditText
        password = findViewById (R.id.edt_conf_password) as EditText

        button3 = findViewById (R.id.L_btn_1) as Button
        button3!!.setOnClickListener { openHomeActivity() }

        button()
    }
    fun openHomeActivity() {
        if (email!!.text.toString() == "Azizfirdaus" && password!!.text.toString() == "1234") {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this@LoginActivity, "Login Failed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun button() {
        button1 = findViewById(R.id.btn_back)
        button1.setOnClickListener {
            startActivity(Intent(this, HomeMainActivity::class.java))
        }
        button2 = findViewById(R.id.txt_register)
        button2.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }


    }
}