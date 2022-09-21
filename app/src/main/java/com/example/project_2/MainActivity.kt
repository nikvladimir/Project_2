package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textVova: TextView = findViewById(R.id.greeting_vova)
        textVova.setOnClickListener() {
            openGreetingVovaActivity()
        }
    }

    private fun openGreetingVovaActivity() {
        val intent = Intent(this, GreetingVova::class.java)
        startActivity(intent)
    }
}