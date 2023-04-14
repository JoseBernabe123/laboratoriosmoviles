package com.renderos.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var nameEditText: TextInputEditText
    private lateinit var correoEditText: TextInputEditText
    private lateinit var numeroEditText: TextInputEditText
    private lateinit var actionNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        correoEditText = findViewById(R.id.correo)

        numeroEditText = findViewById(R.id.numero)
        nameEditText = findViewById(R.id.nombre)
        actionNext = findViewById(R.id.button)

        actionNext.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("name", nameEditText.text.toString())
            intent.putExtra("correo", correoEditText.text.toString())
            intent.putExtra("numero", numeroEditText.text.toString())
            startActivity(intent)

        }


    }
}