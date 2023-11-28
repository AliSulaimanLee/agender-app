package com.agender.app.modules.iphone14promaxten.ui

import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxTenBinding
import com.agender.app.modules.iphone14promaxten.`data`.viewmodel.Iphone14ProMaxTenVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxTenActivity :
    BaseActivity<ActivityIphone14ProMaxTenBinding>(R.layout.activity_iphone_14_pro_max_ten) {
  private val viewModel: Iphone14ProMaxTenVM by viewModels<Iphone14ProMaxTenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxTenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_TEN_ACTIVITY"

  }
}
