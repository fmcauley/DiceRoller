package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.isDigitsOnly


class MainActivity : AppCompatActivity() {


    private lateinit var rollButton : Button
    private lateinit var diceImage: ImageView
    private lateinit var diceImage2: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton= findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)

    }

    private fun rollDice() {
        diceImage.setImageResource(randomNumber())
        diceImage2.setImageResource(randomNumber())
    }

    private fun randomNumber(): Int {
        val drawAbleResource = when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawAbleResource
    }
}

/*
*
* Here you've changed the XML namespace of this attribute from the default android namespace to
* the tools namespace. The tools namespace is used when you want to define placeholder content that
* is only used in the preview or the design editor in Android Studio. Attributes using the tools
* namespace are removed when you compile the app.
*
* */

/*
*
* The app:srcCompat attribute uses the Android X library to support vector drawables in older
* versions of Android, back to API level 7.
* */


