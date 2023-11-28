package com.agender.app.modules.iphone14promaxfour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxFourBinding
import com.agender.app.modules.iphone14promaxfour.`data`.viewmodel.Iphone14ProMaxFourVM
import com.agender.app.modules.iphone14promaxtwo.ui.Iphone14ProMaxTwoActivity
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxFourActivity :
    BaseActivity<ActivityIphone14ProMaxFourBinding>(R.layout.activity_iphone_14_pro_max_four) {
  private val viewModel: Iphone14ProMaxFourVM by viewModels<Iphone14ProMaxFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxFourVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = Iphone14ProMaxTwoActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "IPHONE14PRO_MAX_FOUR_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone14ProMaxFourActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
