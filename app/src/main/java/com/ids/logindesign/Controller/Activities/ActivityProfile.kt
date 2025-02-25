package com.ids.logindesign.Controller.Activities

import Base.AppCompactBase
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.ids.logindesign.Controller.MyApplication
import com.ids.logindesign.R
import com.ids.logindesign.databinding.ActivityProfileBinding
import utils.AppConstants

class ActivityProfile : AppCompactBase() {
    lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(MyApplication.languageCode.equals(AppConstants.LANG_ARABIC)){
            binding.etEmail.textDirection= View.TEXT_DIRECTION_RTL
            binding.etPhoneNum.textDirection= View.TEXT_DIRECTION_RTL
        }else{
            binding.etEmail.textDirection= View.LAYOUT_DIRECTION_LOCALE
            binding.etPhoneNum.textDirection= View.LAYOUT_DIRECTION_LOCALE
        }

            listeners()
    }


    private fun listeners(){
        binding.btEdit.setOnClickListener{startActivity(Intent(this, ActivitySwipe::class.java))}
       // binding.btBack.setOnClickListener{super.onBackPressed()}
    }

}