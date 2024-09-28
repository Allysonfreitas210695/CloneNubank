package com.example.clonenubank

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SegundaActivity : AppCompatActivity() {
    private lateinit var  btnFechar: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        window.statusBarColor = Color.parseColor("#8A19D6")

        btnFechar = findViewById(R.id.btnFechar)

        btnFechar.setOnClickListener {
            finish()
        }
    }
}