package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Electric : AppCompatActivity() {
    lateinit var btnPrevious3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
        castView3()
        click3()
    }
    fun castView3(){
        btnPrevious3=findViewById(R.id.btnPrevious5)
        btnNext3=findViewById(R.id.btnNext4)

    }
    fun click3() {
        btnPrevious3.setOnClickListener {
            val Previous3 = Intent(baseContext, BassGuitar::class.java)
            startActivity(Previous3)
        }
        btnNext3.setOnClickListener {
            val next3 = Intent(baseContext, Classic::class.java)
            startActivity(next3)
        }
    }
}