package com.agender.app.modules.iphone14promaxten.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxTenBinding
import com.agender.app.modules.iphone14promaxeleven.ui.Iphone14ProMaxElevenActivity
import com.agender.app.modules.iphone14promaxten.`data`.viewmodel.Iphone14ProMaxTenVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxTenActivity :
    BaseActivity<ActivityIphone14ProMaxTenBinding>(R.layout.activity_iphone_14_pro_max_ten) {
  private val viewModel: Iphone14ProMaxTenVM by viewModels<Iphone14ProMaxTenVM>()

  private val REQUEST_CODE_IPHONE14PRO_MAX_ELEVEN_ACTIVITY: Int = 851


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = Iphone14ProMaxElevenActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14PRO_MAX_ELEVEN_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_TEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ProMaxTenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
