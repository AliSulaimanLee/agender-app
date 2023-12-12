package com.agender.app.modules.materialdetailvideo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityMaterialDetailVideoBinding
import com.agender.app.modules.materialdetailarticle.ui.MaterialDetailArticleActivity
import com.agender.app.modules.materialdetailvideo.`data`.viewmodel.MaterialDetailVideoVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MaterialDetailVideoActivity :
    BaseActivity<ActivityMaterialDetailVideoBinding>(R.layout.activity_material_detail_video) {
  private val viewModel: MaterialDetailVideoVM by viewModels<MaterialDetailVideoVM>()

  private val REQUEST_CODE_MATERIAL_DETAIL_ARTICLE_ACTIVITY: Int = 195

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.materialDetailVideoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = MaterialDetailArticleActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_DETAIL_ARTICLE_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MATERIAL_DETAIL_VIDEO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MaterialDetailVideoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
