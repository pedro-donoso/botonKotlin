package com.example.boton

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        btnHome = findViewById(R.id.btn_home)
        btnHome.setOnClickListener {
            Toast.makeText(this, "¡Has hecho clic en el botón!", Toast.LENGTH_SHORT).show()
        }
    }
}