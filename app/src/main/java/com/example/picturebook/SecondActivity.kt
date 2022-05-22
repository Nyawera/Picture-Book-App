package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btnBack:Button
    lateinit var btnNext1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnBack=findViewById(R.id.btnBack)
        btnNext1=findViewById(R.id.btnNext1)
        btnBack.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnNext1.setOnClickListener {
        val intent= Intent(this,ThirdActivity::class.java)
        startActivity(intent)
        }
    }
}