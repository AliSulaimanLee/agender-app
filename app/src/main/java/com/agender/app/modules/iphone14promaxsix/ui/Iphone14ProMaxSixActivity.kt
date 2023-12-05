package com.agender.app.modules.iphone14promaxsix.ui

import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxSixBinding
import com.agender.app.modules.iphone14promaxeightcontainer.ui.Iphone14ProMaxEightContainerActivity
import com.agender.app.modules.iphone14promaxsix.`data`.viewmodel.Iphone14ProMaxSixVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxSixActivity :
    BaseActivity<ActivityIphone14ProMaxSixBinding>(R.layout.activity_iphone_14_pro_max_six) {
  private val viewModel: Iphone14ProMaxSixVM by viewModels<Iphone14ProMaxSixVM>()

  private val REQUEST_CODE_IPHONE14PRO_MAX_EIGHT_CONTAINER_ACTIVITY: Int = 673

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = Iphone14ProMaxEightContainerActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14PRO_MAX_EIGHT_CONTAINER_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_SIX_ACTIVITY"

  }
}
