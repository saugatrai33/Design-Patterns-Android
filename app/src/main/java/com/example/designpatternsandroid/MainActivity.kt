package com.example.designpatternsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val iPhone15 = Mobile.Builder()
            .ram(12)
            .soc("Apple M1 Pro Max")
            .build()

        println(iPhone15.ram)
    }
}