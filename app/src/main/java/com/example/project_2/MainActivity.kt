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
        val textKate: TextView = findViewById(R.id.greeting_kate)
        val textMyself: TextView = findViewById(R.id.greeting_myself)

        textVova.setOnClickListener() { openGreetingActivity(GreetingVova::class.java) }
        textKate.setOnClickListener() { openGreetingActivity(GreetingKate::class.java) }
        textMyself.setOnClickListener() { openGreetingActivity(GreetingMyself::class.java) }
    }

    private fun openGreetingActivity(className:  Class<*>) {
        val intent = Intent(this, className)
        startActivity(intent)
    }
}