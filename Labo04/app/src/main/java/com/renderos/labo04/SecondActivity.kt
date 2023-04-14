package com.renderos.labo04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var shareInformationButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nameTextView = findViewById<TextView>(R.id.name_text_view)
        val emailTextView = findViewById<TextView>(R.id.textView3)
        val numberTextView = findViewById<TextView>(R.id.textView4)
        shareInformationButton = findViewById(R.id.compartir)


        val name = intent.getStringExtra("name")
        val correo = intent.getStringExtra("correo")
        val numero = intent.getStringExtra("numero")

        nameTextView.text = name
        emailTextView.text = correo
        numberTextView.text = numero


        shareInformationButton.setOnClickListener{

            val shareIntent = Intent(Intent.ACTION_SEND)

            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,"Name: $name\nEmail: $correo\nCellphone: $numero\n")
            startActivity(Intent.createChooser(shareIntent, "Share to:")) }
        }  }


