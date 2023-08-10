package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class elazig : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elazig)
    }
    fun geri(view: View) {
        val intent = Intent(this@elazig, gezilecekyer::class.java)
        startActivity(intent)

    }
}