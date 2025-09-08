package com.example.lab_week_02_b

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {

    companion object {
        const val COLOR_KEY = "COLOR_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val colorCode = intent.getStringExtra(COLOR_KEY)

        if (colorCode != null) {
            // Change background color
            val backgroundScreen = findViewById<ConstraintLayout>(R.id.background_screen)
            backgroundScreen.setBackgroundColor(Color.parseColor("#$colorCode"))

            // Update text with result
            val resultMessage = findViewById<TextView>(R.id.color_code_result_message)
            resultMessage.text = getString(
                R.string.color_code_result_message,
                colorCode.uppercase()
            )
        }
    }
}