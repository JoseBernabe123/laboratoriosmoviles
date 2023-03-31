package com.renderos.labo03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCentsImageView: ImageView
    private lateinit var cashTextView:TextView
    private lateinit var diezImageView: ImageView
    private lateinit var coraImageView: ImageView
    private lateinit var dollarImageView: ImageView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fiveCentsImageView= findViewById(R.id.five_image_view)
        cashTextView = findViewById(R.id.cash_text_view)
        diezImageView = findViewById(R.id.diez_imageView2)
        coraImageView = findViewById(R.id.cora_imageView)
        dollarImageView = findViewById(R.id.dollar_imageView)

        diezImageView.setOnClickListener {
            cash += 0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
        fiveCentsImageView.setOnClickListener {
            cash += 0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
        coraImageView.setOnClickListener {
            cash += 0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
        dollarImageView.setOnClickListener {
            cash += 1.0
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "${cash}"
        }
    }
}



