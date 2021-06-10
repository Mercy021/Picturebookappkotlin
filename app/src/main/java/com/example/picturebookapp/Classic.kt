package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Classic : AppCompatActivity() {
    lateinit var btnPrevious4: Button
    lateinit var btnNext4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
        castView4()
        click4()



    }

    fun castView4() {
        btnPrevious4 = findViewById(R.id.btnPrevious4)
        btnNext4 = findViewById(R.id.btnNext4)
    }

    fun click4() {
        btnPrevious4.setOnClickListener {
            val Previous4 = Intent(baseContext, Electric::class.java)
            startActivity(Previous4)
        }
        btnNext4.setOnClickListener {
            val next4 = Intent(baseContext, Maina::class.java)
            startActivity(next4)
        }
    }
}