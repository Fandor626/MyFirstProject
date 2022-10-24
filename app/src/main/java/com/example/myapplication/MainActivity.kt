package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phraseArray = listOf<String>("random 1", "random 2", "you win", "random 3", "hello it's me", "random 4")
        val button = findViewById<Button>(R.id.button)
        val myText = findViewById<TextView>(R.id.myText)
        val random = Random
        button.setOnClickListener{
            val randomIndex = random.nextInt(5)
            myText.text = phraseArray[randomIndex]
        }
    }
}
