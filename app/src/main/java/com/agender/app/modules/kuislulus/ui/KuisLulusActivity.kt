package com.agender.app.modules.kuislulus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityKuisLulusBinding
import com.agender.app.modules.kuislulus.`data`.viewmodel.KuisLulusVM
import com.agender.app.modules.materialdetailkuis.ui.MaterialDetailKuisActivity
import com.agender.app.modules.materialpage.ui.MaterialPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KuisLulusActivity : BaseActivity<ActivityKuisLulusBinding>(R.layout.activity_kuis_lulus) {
  private val viewModel: KuisLulusVM by viewModels<KuisLulusVM>()

  private val REQUEST_CODE_MATERIAL_PAGE_ACTIVITY: Int = 719


  private val REQUEST_CODE_MATERIAL_DETAIL_KUIS_ACTIVITY: Int = 917


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kuisLulusVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKembali.setOnClickListener {
      val destIntent = MaterialPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
    }
    binding.btnCobaLagi.setOnClickListener {
      val destIntent = MaterialDetailKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_DETAIL_KUIS_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "KUIS_LULUS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, KuisLulusActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
