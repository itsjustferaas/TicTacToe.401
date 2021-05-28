package com.example.tictactoe401

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.startGame)
        val button2 = findViewById<Button>(R.id.quitGame)

        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        } //Start Game

        button2.setOnClickListener{
             val quit : AlertDialog = AlertDialog.Builder(this).create()
             quit.setTitle("Quit Game")
             quit.setMessage("Are you sure you want to quit?")
             quit.setButton(AlertDialog.BUTTON_POSITIVE,"Yes"){
                dialog, which -> finish()
                dialog.dismiss()
             } //Quit Game Dialog

             quit.setButton(AlertDialog.BUTTON_NEGATIVE,"No"){
                 dialog, which ->
                 dialog.dismiss()
             } //Stay in Game
             quit.show() //Show dialog
         }
    }
}
