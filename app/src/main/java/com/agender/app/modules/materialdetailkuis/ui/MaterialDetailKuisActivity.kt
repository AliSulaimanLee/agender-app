package com.agender.app.modules.materialdetailkuis.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityMaterialDetailKuisBinding
import com.agender.app.modules.materialdetailkuis.`data`.viewmodel.MaterialDetailKuisVM
import com.agender.app.modules.pertanyaankuis.ui.PertanyaanKuisActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MaterialDetailKuisActivity :
    BaseActivity<ActivityMaterialDetailKuisBinding>(R.layout.activity_material_detail_kuis) {
  private val viewModel: MaterialDetailKuisVM by viewModels<MaterialDetailKuisVM>()

  private val REQUEST_CODE_PERTANYAAN_KUIS_ACTIVITY: Int = 685


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.materialDetailKuisVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnYakin.setOnClickListener {
      val destIntent = PertanyaanKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_PERTANYAAN_KUIS_ACTIVITY)
    }
    binding.btnKembali.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MATERIAL_DETAIL_KUIS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MaterialDetailKuisActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
