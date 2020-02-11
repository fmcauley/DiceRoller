package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {


    private lateinit var rollButton : Button
    private lateinit var diceImage: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton= findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }
        diceImage = findViewById(R.id.dice_image)

    }

    private fun rollDice() {
        val drawAbleResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawAbleResource)

    }
}
