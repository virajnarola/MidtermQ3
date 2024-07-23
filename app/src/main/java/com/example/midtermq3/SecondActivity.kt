package com.example.midtermq3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val textView = findViewById<TextView>(R.id.text_view_message)
        textView.text = message
    }
}
