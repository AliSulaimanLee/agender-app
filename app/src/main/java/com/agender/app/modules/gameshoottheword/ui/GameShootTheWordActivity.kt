package com.agender.app.modules.gameshoottheword.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityGameShootTheWordBinding
import com.agender.app.modules.gameshoottheword.`data`.viewmodel.GameShootTheWordVM
import com.agender.app.modules.gameshootthewordone.ui.GameShootTheWordOneActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GameShootTheWordActivity :
    BaseActivity<ActivityGameShootTheWordBinding>(R.layout.activity_game_shoot_the_word) {
  private val viewModel: GameShootTheWordVM by viewModels<GameShootTheWordVM>()

  private val REQUEST_CODE_GAME_SHOOT_THE_WORD_ONE_ACTIVITY: Int = 584

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gameShootTheWordVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtPATRIARKI.setOnClickListener {
      val destIntent = GameShootTheWordOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_GAME_SHOOT_THE_WORD_ONE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "GAME_SHOOT_THE_WORD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GameShootTheWordActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
