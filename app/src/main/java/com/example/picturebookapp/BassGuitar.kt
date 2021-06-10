package com.example.picturebookapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BassGuitar : AppCompatActivity() {
    lateinit var btnprevious2:Button
    lateinit var btnNext2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        castView2()
        click2()
    }
    fun castView2(){
        btnprevious2=findViewById(R.id.btnprevious2)
        btnNext2=findViewById(R.id.btnNext2)
    }
    fun click2(){
        btnprevious2.setOnClickListener {
            val previous2= Intent(baseContext,MainActivity::class.java)
            startActivity(previous2)
         }
        btnNext2.setOnClickListener {
            val next2=Intent(baseContext,Electric::class.java)
            startActivity(next2)
        }
    }
}