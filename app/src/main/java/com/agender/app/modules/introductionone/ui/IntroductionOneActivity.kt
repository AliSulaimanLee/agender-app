package com.agender.app.modules.introductionone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIntroductionOneBinding
import com.agender.app.modules.introductionone.`data`.viewmodel.IntroductionOneVM
import com.agender.app.modules.introductiontwo.ui.IntroductionTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class IntroductionOneActivity :
    BaseActivity<ActivityIntroductionOneBinding>(R.layout.activity_introduction_one) {
  private val viewModel: IntroductionOneVM by viewModels<IntroductionOneVM>()

  private val REQUEST_CODE_INTRODUCTION_TWO_ACTIVITY: Int = 604

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introductionOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.viewRectangleFourOne.setOnClickListener {
      val destIntent = IntroductionTwoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_INTRODUCTION_TWO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "INTRODUCTION_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntroductionOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
