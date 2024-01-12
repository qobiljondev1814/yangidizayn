package com.example.yangidizayn

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn = findViewById<Button>(R.id.btnCreate)

        btn.setOnClickListener {
            var intent = Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(intent)

        }
    }
}