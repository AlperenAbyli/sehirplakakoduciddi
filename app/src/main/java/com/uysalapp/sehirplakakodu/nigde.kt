package com.uysalapp.sehirplakakodu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class nigde : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nigde)
    }
    fun geri(view: View) {
        val intent = Intent(this@nigde, gezilecekyer::class.java)
        startActivity(intent)

    }
}