package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.net.*

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)
        val url = "https://mirea.ru"
        btn1.setOnClickListener {
            // неявный Intent
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse(url))
            startActivity(intent)
        }
        btn2.setOnClickListener {
            // явный Intent
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("key","Hello from MainActivity!")
            startActivity(intent)
        }

    }
}