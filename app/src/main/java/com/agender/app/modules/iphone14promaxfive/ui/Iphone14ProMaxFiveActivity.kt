package com.agender.app.modules.iphone14promaxfive.ui

import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxFiveBinding
import com.agender.app.modules.iphone14promaxfive.`data`.viewmodel.Iphone14ProMaxFiveVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxFiveActivity :
    BaseActivity<ActivityIphone14ProMaxFiveBinding>(R.layout.activity_iphone_14_pro_max_five) {
  private val viewModel: Iphone14ProMaxFiveVM by viewModels<Iphone14ProMaxFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_FIVE_ACTIVITY"

  }
}
