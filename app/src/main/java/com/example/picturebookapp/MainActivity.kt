package com.example.picturebookapp

//import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

//@SuppressLint("WrongViewCast")
class MainActivity : AppCompatActivity() {

    lateinit var btnNext:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        click()


            }
    fun castView(){
        btnNext=findViewById(R.id.btnNext4)
    }
    fun click(){
        btnNext.setOnClickListener {
            val next=Intent(baseContext,BassGuitar::class.java)
            startActivity(next)
        }
    }



}


