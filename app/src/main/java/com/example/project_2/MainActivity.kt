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

        textVova.setOnClickListener() { openGreetingVovaActivity() }
        textKate.setOnClickListener() { openGreetingKateActivity(GreetingKate::class.java) }
        textMyself.setOnClickListener() { openGreetingMyselfActivity(GreetingMyself::class.java) }
    }

    private fun openGreetingVovaActivity() {
        val intent = Intent(this, GreetingVova::class.java)
        startActivity(intent)
    }

    private fun openGreetingKateActivity(className:  Class<*>) {
        val intent = Intent(this, className)
        startActivity(intent)
    }

    private fun openGreetingMyselfActivity(className:  Class<*>) {
        val intent = Intent(this, className::class.java)
        startActivity(intent)
    }
}