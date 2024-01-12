package com.example.yangidizayn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
     super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.btnGet)

        btn.setOnClickListener {
            var intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}