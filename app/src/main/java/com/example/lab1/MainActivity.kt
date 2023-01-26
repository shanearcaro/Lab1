package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.counter_text)
        val button = findViewById<Button>(R.id.counter_button)
        val add2 = findViewById<Button>(R.id.upgrade_button)

        var increment = 1
        var counter = 0

        button.setOnClickListener {
            counter += increment
            text.text = counter.toString()

            if (counter == 100) {
                add2.visibility = View.VISIBLE
            }
        }

        add2.setOnClickListener {
            it.visibility = View.INVISIBLE
            increment = 2
        }
    }
}