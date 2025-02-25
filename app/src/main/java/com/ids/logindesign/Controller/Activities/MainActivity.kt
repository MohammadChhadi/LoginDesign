package com.ids.logindesign.Controller

import Base.AppCompactBase
import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.ids.logindesign.Controller.Activities.ActivityProfile
import com.ids.logindesign.R
import com.ids.logindesign.databinding.ActivityMainBinding
import utils.AppConstants
import utils.LocaleUtils
import java.util.*

class MainActivity : AppCompactBase() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if(MyApplication.languageCode.equals(AppConstants.LANG_ARABIC)){
            binding. btChangeLanguage.setText("English")

        }else{
            binding. btChangeLanguage.setText("عربي")
        }


     /*   Handler(Looper.getMainLooper()).postDelayed({
            if(MyApplication.isFirstLaunch){
                MyApplication.isFirstLaunch=false
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }else{

            }


        }, 10000)*/

        listeners()


    }

    private fun listeners(){
        binding.btLogin.setOnClickListener{startActivity(Intent(this, ActivityProfile::class.java))}

        binding.btChangeLanguage.setOnClickListener {
            if(MyApplication.languageCode.equals(AppConstants.LANG_ARABIC)){
                changeToEnglish()
            }else{
                changeToArabic()
            }
        }

    }

    fun changeToEnglish(){
        MyApplication.languageCode = AppConstants.LANG_ENGLISH
        LocaleUtils.setLocale(Locale("en"))
        LocaleUtils.updateConfig(
            application,
            baseContext.resources.configuration
        )

        try {
            finish();
            startActivity(Intent(this,MainActivity::class.java));
        } catch (e: Exception) {
        }
    }
    fun changeToArabic(){
        MyApplication.languageCode = AppConstants.LANG_ARABIC

        LocaleUtils.setLocale(Locale("ar"))
        LocaleUtils.updateConfig(
            application,
            baseContext.resources.configuration
        )
        try {
            finish();
            startActivity(Intent(this,MainActivity::class.java));
        } catch (e: Exception) {
        }
    }


}