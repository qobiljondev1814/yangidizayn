package com.example.yangidizayn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btn = findViewById<TextView>(R.id.btnDay)

        btn.setOnClickListener {
            var intent = Intent(this@MainActivity3,MainActivity4::class.java)
            startActivity(intent)
            finish()
        }
    }
}