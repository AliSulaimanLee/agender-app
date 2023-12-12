package com.agender.app.modules.introductiontwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIntroductionTwoBinding
import com.agender.app.modules.introductionthree.ui.IntroductionThreeActivity
import com.agender.app.modules.introductiontwo.`data`.viewmodel.IntroductionTwoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class IntroductionTwoActivity :
    BaseActivity<ActivityIntroductionTwoBinding>(R.layout.activity_introduction_two) {
  private val viewModel: IntroductionTwoVM by viewModels<IntroductionTwoVM>()

  private val REQUEST_CODE_INTRODUCTION_THREE_ACTIVITY: Int = 313


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introductionTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleFourTwo.setOnClickListener {
      val destIntent = IntroductionThreeActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_INTRODUCTION_THREE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "INTRODUCTION_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntroductionTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
