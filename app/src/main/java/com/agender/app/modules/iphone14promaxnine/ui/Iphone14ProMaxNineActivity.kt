package com.agender.app.modules.iphone14promaxnine.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxNineBinding
import com.agender.app.modules.iphone14promaxnine.`data`.viewmodel.Iphone14ProMaxNineVM
import com.agender.app.modules.iphone14promaxten.ui.Iphone14ProMaxTenActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxNineActivity :
    BaseActivity<ActivityIphone14ProMaxNineBinding>(R.layout.activity_iphone_14_pro_max_nine) {
  private val viewModel: Iphone14ProMaxNineVM by viewModels<Iphone14ProMaxNineVM>()

  private val REQUEST_CODE_IPHONE14PRO_MAX_TEN_ACTIVITY: Int = 819


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = Iphone14ProMaxTenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14PRO_MAX_TEN_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_NINE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ProMaxNineActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
