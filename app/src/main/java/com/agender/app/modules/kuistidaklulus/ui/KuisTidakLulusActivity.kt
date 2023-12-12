package com.agender.app.modules.kuistidaklulus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityKuisTidakLulusBinding
import com.agender.app.modules.kuistidaklulus.`data`.viewmodel.KuisTidakLulusVM
import com.agender.app.modules.materialdetailkuis.ui.MaterialDetailKuisActivity
import com.agender.app.modules.materialpage.ui.MaterialPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KuisTidakLulusActivity :
    BaseActivity<ActivityKuisTidakLulusBinding>(R.layout.activity_kuis_tidak_lulus) {
  private val viewModel: KuisTidakLulusVM by viewModels<KuisTidakLulusVM>()

  private val REQUEST_CODE_MATERIAL_DETAIL_KUIS_ACTIVITY: Int = 987

  private val REQUEST_CODE_MATERIAL_PAGE_ACTIVITY: Int = 143

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kuisTidakLulusVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnCobaLagi.setOnClickListener {
      val destIntent = MaterialDetailKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_DETAIL_KUIS_ACTIVITY)
    }
    binding.btnKembali.setOnClickListener {
      val destIntent = MaterialPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
    }
  }

  companion object {
    const val TAG: String = "KUIS_TIDAK_LULUS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KuisTidakLulusActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
