package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class Diffifulty : AppCompatActivity() {
    private lateinit var nextbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diffifulty)
        loadElements()

        nextbtn.setOnClickListener {

            var btn1 = nextbtn.text.toString()

            sendResource(btn1)
        }



    }

    private fun loadElements() {
        nextbtn = findViewById(R.id.easybtn)
    }

    private fun sendResource(btn1: String) {
        val intent = Intent(this, SelectScreen::class.java)
        intent.putExtra(btn1)
        startActivity(intent)

    }
}

private fun Intent.putExtra(btn1: String) {

}
