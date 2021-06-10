package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Maina : AppCompatActivity() {
    lateinit var btnPrevious5: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_5)
        castView5()
        click()
    }
    fun castView5(){
        btnPrevious5=findViewById(R.id.btnPrevious5)
    }
    fun click(){
        btnPrevious5.setOnClickListener{
            val Previous= Intent(baseContext,Classic::class.java)
            startActivity(Previous)

        }
    }
}