package com.example.st10461229_imad51112_practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    private lateinit var button22: Button
    private lateinit var inputTextView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        button22 = findViewById(R.id.button22)
        button22.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val button22 = findViewById<Button>(R.id.button22)
        button22.setOnClickListener {
            clearInput()
        }

        val weeklyWeather = arrayOf(
            "Sunny", "Partly Cloudy", "Rainy", "Snowy", "Windy", "Foggy", "Stormy"
        )

        for (day in weeklyWeather) {
            println(day)
    }
}
    private fun clearInput() {
        inputTextView.text = ""
    }
}