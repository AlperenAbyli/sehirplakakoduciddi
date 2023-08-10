package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class mardin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mardin)
    }
    fun geri(view: View) {
        val intent = Intent(this@mardin, gezilecekyer::class.java)
        startActivity(intent)

    }
}