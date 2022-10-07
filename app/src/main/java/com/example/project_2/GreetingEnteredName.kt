package com.example.project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingEnteredName : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_entered_name)

        val message = intent.getStringExtra("key")
        val textMyself: TextView = findViewById(R.id.greetingTextView)
        textMyself.text = message

        val backButton: TextView = findViewById(R.id.backButton)
        backButton.setOnClickListener() { backToMainActivity() }
    }

    private fun backToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}
