package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btnBack4=findViewById(R.id.btnBack4)
        btnNext4=findViewById(R.id.btnNext4)
        btnBack4.setOnClickListener {
            val intent= Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }
        btnNext4.setOnClickListener {
        val intent= Intent(this,FifthActivity::class.java)
        startActivity(intent)
        }
    }
}