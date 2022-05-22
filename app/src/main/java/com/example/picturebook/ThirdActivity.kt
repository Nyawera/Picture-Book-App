package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    lateinit var btnBack3:Button
    lateinit var btnNext3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnBack3=findViewById(R.id.btnBack3)
        btnNext3=findViewById(R.id.btnNext3)
        btnBack3.setOnClickListener {
            val intent=Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener {
        val intent=Intent(this,FourthActivity::class.java)
        startActivity(intent)
        }
    }
}