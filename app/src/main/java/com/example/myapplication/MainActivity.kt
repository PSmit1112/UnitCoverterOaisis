package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {

    private lateinit var valueEditText: EditText
    private lateinit var convertButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        valueEditText = findViewById(R.id.valueEditText)
        convertButton = findViewById(R.id.convertButton)
        resultTextView = findViewById(R.id.resultTextView)

        convertButton.setOnClickListener { convertParameter() }

    }

    private fun convertParameter() {
        val inputValue = valueEditText.text.toString().toFloat()

        // Grams to Kilograms
        val kgValue = inputValue / 1000

        // Meters to Kilometers
        val kmValue = inputValue / 1000

        // Kilograms to Grams
        val gValue = inputValue * 1000

        // Kilometers to Meters
        val mValue = inputValue * 1000

        // Meter to Centimeter
        val cmValue = inputValue * 100

        val result = "Grams to Kilograms: $kgValue kg\n" +
                "Meters to Kilometers: $kmValue km\n" +
                "Kilograms to Grams: $gValue g\n" +
                "Kilometers to Meters: $mValue m\n" +
                "Meter to Centimeter: $cmValue cm\n"


        resultTextView.text = result
    }
}