package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PerformingAction : AppCompatActivity() {
    lateinit var sub1: EditText
    lateinit var sub2: EditText
    lateinit var sub3: EditText
    lateinit var b: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_performing_action)
        sub1 = findViewById(R.id.E1)
        sub2 = findViewById(R.id.E2)
        sub3 = findViewById(R.id.E3)
        b = findViewById(R.id.b1)

        b.setOnClickListener {
            val aText = sub1.text.toString()
            val bText = sub2.text.toString()
            val cText = sub3.text.toString()

            // check empty
            if (aText.isEmpty() || bText.isEmpty() || cText.isEmpty()) {
                Toast.makeText(this, "Please enter all three values", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val a = aText.toInt()
            val b = bText.toInt()
            val c = cText.toInt()

            val sum = (a + b + c) / 30f   // float result

            Toast.makeText(this, "CGPA: $sum", Toast.LENGTH_LONG).show()
        }

    }
}