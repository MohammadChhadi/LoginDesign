package com.ids.logindesign.Controller.Activities

import Base.AppCompactBase
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import com.ids.logindesign.Controller.MyApplication
import com.ids.logindesign.R
import utils.AppConstants

class ActivityProfile : AppCompactBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        val etEmail = findViewById<EditText>(R.id.etEmail)
        if(MyApplication.languageCode.equals(AppConstants.LANG_ARABIC)){
            etEmail.textDirection= View.TEXT_DIRECTION_RTL
        }else{
            etEmail.textDirection= View.LAYOUT_DIRECTION_LOCALE
        }

            listeners()
    }


    private fun listeners(){
        val btBack = findViewById<ImageButton>(R.id.btBack)
        btBack.setOnClickListener{super.onBackPressed()}
    }

}