package com.agender.app.modules.materialpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityMaterialPageBinding
import com.agender.app.modules.masukgameone.ui.MasukGameOneActivity
import com.agender.app.modules.materialdetailkuis.ui.MaterialDetailKuisActivity
import com.agender.app.modules.materialdetailvideo.ui.MaterialDetailVideoActivity
import com.agender.app.modules.materialpage.`data`.viewmodel.MaterialPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MaterialPageActivity :
    BaseActivity<ActivityMaterialPageBinding>(R.layout.activity_material_page) {
  private val viewModel: MaterialPageVM by viewModels<MaterialPageVM>()

  private val REQUEST_CODE_MATERIAL_DETAIL_VIDEO_ACTIVITY: Int = 430


  private val REQUEST_CODE_MASUK_GAME_ONE_ACTIVITY: Int = 364


  private val REQUEST_CODE_MATERIAL_DETAIL_KUIS_ACTIVITY: Int = 351


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.materialPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFrameThirtyThree.setOnClickListener {
      val destIntent = MaterialDetailVideoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_DETAIL_VIDEO_ACTIVITY)
    }
    binding.btnFrameThirtyEight.setOnClickListener {
      val destIntent = MasukGameOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MASUK_GAME_ONE_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnFrameThirtyNineOne.setOnClickListener {
      val destIntent = MaterialDetailKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_DETAIL_KUIS_ACTIVITY)
    }
    binding.btnGetStarted.setOnClickListener {
      val destIntent = MaterialDetailVideoActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_DETAIL_VIDEO_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "MATERIAL_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MaterialPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
