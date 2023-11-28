package com.agender.app.modules.iphone14promaxnine.ui

import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxNineBinding
import com.agender.app.modules.iphone14promaxnine.`data`.viewmodel.Iphone14ProMaxNineVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxNineActivity :
    BaseActivity<ActivityIphone14ProMaxNineBinding>(R.layout.activity_iphone_14_pro_max_nine) {
  private val viewModel: Iphone14ProMaxNineVM by viewModels<Iphone14ProMaxNineVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxNineVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_NINE_ACTIVITY"

  }
}
