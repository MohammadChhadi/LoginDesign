package com.ids.logindesign.Controller.Activities

import Base.AppCompactBase
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.ids.logindesign.Controller.MyApplication
import com.ids.logindesign.R
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.toolbar_trans.*
import utils.AppConstants

class ActivityProfile : AppCompactBase() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        if(MyApplication.languageCode.equals(AppConstants.LANG_ARABIC)){
            etEmail.textDirection= View.TEXT_DIRECTION_RTL
            etPhoneNum.textDirection= View.TEXT_DIRECTION_RTL
        }else{
            etEmail.textDirection= View.LAYOUT_DIRECTION_LOCALE
            etPhoneNum.textDirection= View.LAYOUT_DIRECTION_LOCALE
        }

            listeners()
    }


    private fun listeners(){
        btEdit.setOnClickListener{startActivity(Intent(this, ActivitySwipe::class.java))}
        btBack.setOnClickListener{super.onBackPressed()}
    }

}