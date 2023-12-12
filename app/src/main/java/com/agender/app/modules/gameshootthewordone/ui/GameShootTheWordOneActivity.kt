package com.agender.app.modules.gameshootthewordone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityGameShootTheWordOneBinding
import com.agender.app.modules.gameshootthewordone.`data`.viewmodel.GameShootTheWordOneVM
import com.agender.app.modules.materialpage.ui.MaterialPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class GameShootTheWordOneActivity :
    BaseActivity<ActivityGameShootTheWordOneBinding>(R.layout.activity_game_shoot_the_word_one) {
  private val viewModel: GameShootTheWordOneVM by viewModels<GameShootTheWordOneVM>()

  private val REQUEST_CODE_MATERIAL_PAGE_ACTIVITY: Int = 886


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.gameShootTheWordOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = MaterialPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "GAME_SHOOT_THE_WORD_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, GameShootTheWordOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
