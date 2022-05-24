package com.ids.logindesign.Controller

import Base.AppCompactBase
import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.ids.logindesign.Controller.Activities.ActivityProfile
import com.ids.logindesign.R
import utils.AppConstants
import utils.LocaleUtils
import java.util.*

class MainActivity : AppCompactBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btChangeLanguage = findViewById<Button>(R.id.btChangeLanguage)
       // Toast.makeText(applicationContext,MyApplication.languageCode,Toast.LENGTH_SHORT).show()
        if(MyApplication.languageCode.equals(AppConstants.LANG_ARABIC)){
            btChangeLanguage.setText("EN")
        }else{
            btChangeLanguage.setText("عربي")
        }

        listeners()


    }

    private fun listeners(){
        val btnLogin = findViewById<Button>(R.id.btLogin)
        val btChangeLanguage = findViewById<Button>(R.id.btChangeLanguage)
        btnLogin.setOnClickListener{startActivity(Intent(this, ActivityProfile::class.java))}

        btChangeLanguage.setOnClickListener {
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

  /* fun setLocate(Lang: String?){
        val locale = Locale(Lang)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        baseContext.resources.updateConfiguration(config,baseContext.resources.displayMetrics)

    }*/


}