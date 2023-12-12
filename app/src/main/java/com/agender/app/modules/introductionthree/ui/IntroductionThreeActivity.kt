package com.agender.app.modules.introductionthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIntroductionThreeBinding
import com.agender.app.modules.homepagecontainer.ui.HomepageContainerActivity
import com.agender.app.modules.introductionthree.`data`.viewmodel.IntroductionThreeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class IntroductionThreeActivity :
    BaseActivity<ActivityIntroductionThreeBinding>(R.layout.activity_introduction_three) {
  private val viewModel: IntroductionThreeVM by viewModels<IntroductionThreeVM>()

  private val REQUEST_CODE_HOMEPAGE_CONTAINER_ACTIVITY: Int = 569

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introductionThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnGetStarted.setOnClickListener {
      val destIntent = HomepageContainerActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_HOMEPAGE_CONTAINER_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "INTRODUCTION_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntroductionThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
