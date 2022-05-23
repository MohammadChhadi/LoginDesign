package com.ids.logindesign.Controller.Activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ids.logindesign.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listeners()
    }

    private fun listeners(){
        val btnLogin = findViewById<Button>(R.id.btLogin)
        btnLogin.setOnClickListener{startActivity(Intent(this, ActivityProfile::class.java))}
    }

}