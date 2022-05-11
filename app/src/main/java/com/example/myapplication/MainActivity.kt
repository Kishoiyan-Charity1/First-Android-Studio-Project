package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBmi:Button
    lateinit var btnSendMoney:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBmi=findViewById(R.id.btnBmi)
        btnSendMoney = findViewById(R.id.btnsend)
        btnBmi.setOnClickListener {
            val intent=Intent(this,CalculateBmiActivity::class.java)
            startActivity(intent)
        }
        btnSendMoney.setOnClickListener {
            val intent=Intent(this, SendMoneyActivity::class.java)
            startActivity(intent)
        }
    }
}