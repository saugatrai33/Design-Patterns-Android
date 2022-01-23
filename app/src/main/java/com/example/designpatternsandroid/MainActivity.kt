package com.example.designpatternsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialog = DialogFactory.createDialog(DialogType.DIALOG_CREATE_CHAT)
        println(dialog)
    }
}