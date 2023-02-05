package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class WinnerPage: AppCompatActivity() {

    lateinit var winner: TextView
    lateinit var restart: AppCompatButton
    lateinit var home: AppCompatButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.winner_page)
        loadElements()


    }

    private fun loadElements() {
        winner = findViewById(R.id.winner)
        restart = findViewById(R.id.restart)
        home = findViewById(R.id.home)
    }
}