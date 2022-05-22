package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext=findViewById<Button?>(R.id.btnNext)
            btnNext.setOnClickListener {
                val intent=Intent(this,SecondActivity::class.java)
                startActivity(intent)
            }
    }
}