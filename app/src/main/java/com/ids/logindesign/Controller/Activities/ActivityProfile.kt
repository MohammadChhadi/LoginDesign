package com.ids.logindesign.Controller.Activities

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.ids.logindesign.R

class ActivityProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

            listeners()
    }


    private fun listeners(){
        val btBack = findViewById<ImageButton>(R.id.btBack)
        btBack.setOnClickListener{super.onBackPressed()}
    }

}