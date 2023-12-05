package com.agender.app.modules.iphone14promaxeleven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxElevenBinding
import com.agender.app.modules.iphone14promaxeleven.`data`.viewmodel.Iphone14ProMaxElevenVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxElevenActivity :
    BaseActivity<ActivityIphone14ProMaxElevenBinding>(R.layout.activity_iphone_14_pro_max_eleven) {
  private val viewModel: Iphone14ProMaxElevenVM by viewModels<Iphone14ProMaxElevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxElevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_ELEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ProMaxElevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
