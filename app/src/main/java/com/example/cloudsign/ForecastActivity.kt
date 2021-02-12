package com.example.cloudsign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ForecastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        val listView = findViewById<ListView>(R.id.lvForecast)

        val alphabets = listOf("A", "B", "C", "D", "E", "F", "B", "C", "D", "E", "F", "B", "C",
            "D", "E", "F", "B", "C", "D", "E", "F", "B", "C", "D", "E", "F", "B", "C", "D", "E", "F")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, alphabets)

        listView.adapter = adapter
        
    }
}