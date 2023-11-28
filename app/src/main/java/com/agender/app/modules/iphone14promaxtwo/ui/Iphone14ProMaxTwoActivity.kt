package com.agender.app.modules.iphone14promaxtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxTwoBinding
import com.agender.app.modules.iphone14promaxfour.ui.Iphone14ProMaxFourActivity
import com.agender.app.modules.iphone14promaxthree.ui.Iphone14ProMaxThreeActivity
import com.agender.app.modules.iphone14promaxtwo.`data`.viewmodel.Iphone14ProMaxTwoVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxTwoActivity :
    BaseActivity<ActivityIphone14ProMaxTwoBinding>(R.layout.activity_iphone_14_pro_max_two) {
  private val viewModel: Iphone14ProMaxTwoVM by viewModels<Iphone14ProMaxTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignIn.setOnClickListener {
      val destIntent = Iphone14ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtConfirmation.setOnClickListener {
      val destIntent = Iphone14ProMaxThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ProMaxTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
