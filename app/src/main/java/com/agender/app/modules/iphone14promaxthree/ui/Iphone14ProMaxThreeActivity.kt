package com.agender.app.modules.iphone14promaxthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxThreeBinding
import com.agender.app.modules.iphone14promaxfour.ui.Iphone14ProMaxFourActivity
import com.agender.app.modules.iphone14promaxthree.`data`.viewmodel.Iphone14ProMaxThreeVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxThreeActivity :
    BaseActivity<ActivityIphone14ProMaxThreeBinding>(R.layout.activity_iphone_14_pro_max_three) {
  private val viewModel: Iphone14ProMaxThreeVM by viewModels<Iphone14ProMaxThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSignUp.setOnClickListener {
      val destIntent = Iphone14ProMaxFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ProMaxThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
