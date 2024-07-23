package com.example.midtermq3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonToFirst = findViewById<Button>(R.id.button_to_first)
        val buttonToSecond = findViewById<Button>(R.id.button_to_second)

        buttonToFirst.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity to FirstActivity")
            startActivity(intent)
        }

        buttonToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity to SecondActivity")
            startActivity(intent)
        }
    }
}
