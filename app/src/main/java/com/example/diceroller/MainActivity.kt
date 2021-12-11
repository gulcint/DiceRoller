package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val TAG: String = "gulcin"
    private lateinit var button : Button
    private lateinit var imageview : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button    = findViewById(R.id.diceButton)
        imageview = findViewById(R.id.diceImageView)
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Method worked")

        button.setOnClickListener{
            Log.d(TAG, "setOnCLickListener worked")
            generateRandomNumber()
            Toast.makeText(button.context,"Zar atiliyor..",Toast.LENGTH_SHORT).show()
        }
    }

    private fun generateRandomNumber(){
        var randomDiceNumber = (1..6).random()
        Log.d(TAG,"" + randomDiceNumber)
        showDiceImage(randomDiceNumber)
    }

    private fun showDiceImage(number : Int){
        Log.d(TAG,"" + "ShowDiceNumber worked.")

        when(number){
            1 -> imageview.setImageResource(R.drawable.dice_1)
            2 -> imageview.setImageResource(R.drawable.dice_2)
            3 -> imageview.setImageResource(R.drawable.dice_3)
            4 -> imageview.setImageResource(R.drawable.dice_4)
            5 -> imageview.setImageResource(R.drawable.dice_5)
            6 -> imageview.setImageResource(R.drawable.dice_6)
        }
    }
}