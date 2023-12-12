package com.agender.app.modules.materialdetailarticle.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityMaterialDetailArticleBinding
import com.agender.app.modules.materialdetailarticle.`data`.viewmodel.MaterialDetailArticleVM
import com.agender.app.modules.materialpage.ui.MaterialPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MaterialDetailArticleActivity :
    BaseActivity<ActivityMaterialDetailArticleBinding>(R.layout.activity_material_detail_article) {
  private val viewModel: MaterialDetailArticleVM by viewModels<MaterialDetailArticleVM>()

  private val REQUEST_CODE_MATERIAL_PAGE_ACTIVITY: Int = 388


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.materialDetailArticleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = MaterialPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MATERIAL_DETAIL_ARTICLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MaterialDetailArticleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
