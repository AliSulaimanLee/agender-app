package com.agender.app.modules.iphone14promaxone.ui

import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxOneBinding
import com.agender.app.modules.iphone14promaxone.`data`.viewmodel.Iphone14ProMaxOneVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxOneActivity :
    BaseActivity<ActivityIphone14ProMaxOneBinding>(R.layout.activity_iphone_14_pro_max_one) {
  private val viewModel: Iphone14ProMaxOneVM by viewModels<Iphone14ProMaxOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_ONE_ACTIVITY"

  }
}
