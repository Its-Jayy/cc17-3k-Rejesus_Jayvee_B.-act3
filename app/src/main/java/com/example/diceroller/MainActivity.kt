package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get references to the views in the layout
        diceImage = findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)

        // Set an onClickListener for the button
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    // Function to roll the dice
    private fun rollDice() {
        // Generate a random number between 1 and 6
        val diceRoll = Random.nextInt(6) + 1

        // Select the appropriate image resource based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // Update the ImageView with the new dice image
        diceImage.setImageResource(drawableResource)
    }
}
