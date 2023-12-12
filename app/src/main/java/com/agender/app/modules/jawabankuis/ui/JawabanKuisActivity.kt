package com.agender.app.modules.jawabankuis.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityJawabanKuisBinding
import com.agender.app.modules.jawabankuis.`data`.viewmodel.JawabanKuisVM
import com.agender.app.modules.kuislulus.ui.KuisLulusActivity
import com.agender.app.modules.kuistidaklulus.ui.KuisTidakLulusActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class JawabanKuisActivity : BaseActivity<ActivityJawabanKuisBinding>(R.layout.activity_jawaban_kuis)
    {
  private val viewModel: JawabanKuisVM by viewModels<JawabanKuisVM>()

  private val REQUEST_CODE_KUIS_LULUS_ACTIVITY: Int = 147

  private val REQUEST_CODE_KUIS_TIDAK_LULUS_ACTIVITY: Int = 555

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.jawabanKuisVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnTwo.setOnClickListener {
      val destIntent = KuisLulusActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_KUIS_LULUS_ACTIVITY)
    }
    binding.btnOne.setOnClickListener {
      val destIntent = KuisTidakLulusActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_KUIS_TIDAK_LULUS_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "JAWABAN_KUIS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, JawabanKuisActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
