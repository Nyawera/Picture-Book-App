package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FifthActivity : AppCompatActivity() {
    lateinit var btnBackhome:Button
    lateinit var btnPreview:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        btnBackhome=findViewById(R.id.btnBackhome)
        btnPreview=findViewById(R.id.btnPreview)
        btnPreview.setOnClickListener {
            val intent= Intent(this,FifthActivity::class.java)
            startActivity(intent)
        }
        btnBackhome.setOnClickListener {
        val intent= Intent(this,MainActivity::class.java)
         startActivity(intent)
        }
    }
}