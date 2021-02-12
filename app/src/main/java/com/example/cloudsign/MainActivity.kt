package com.example.cloudsign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnForecast = findViewById<Button>(R.id.btnForecast)

        btnForecast.setOnClickListener {
            val intent = Intent(this, ForecastActivity::class.java)

            startActivity(intent)
        }
    }
}