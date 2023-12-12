package com.agender.app.modules.masukgameone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityMasukGameOneBinding
import com.agender.app.modules.gameshoottheword.ui.GameShootTheWordActivity
import com.agender.app.modules.masukgameone.`data`.viewmodel.MasukGameOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MasukGameOneActivity :
    BaseActivity<ActivityMasukGameOneBinding>(R.layout.activity_masuk_game_one) {
  private val viewModel: MasukGameOneVM by viewModels<MasukGameOneVM>()

  private val REQUEST_CODE_GAME_SHOOT_THE_WORD_ACTIVITY: Int = 102

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.masukGameOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      finish()
    }
    binding.btnYakin.setOnClickListener {
      val destIntent = GameShootTheWordActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GAME_SHOOT_THE_WORD_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MASUK_GAME_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MasukGameOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
