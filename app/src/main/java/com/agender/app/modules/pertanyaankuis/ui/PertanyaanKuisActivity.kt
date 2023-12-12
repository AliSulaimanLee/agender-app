package com.agender.app.modules.pertanyaankuis.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityPertanyaanKuisBinding
import com.agender.app.modules.jawabankuis.ui.JawabanKuisActivity
import com.agender.app.modules.pertanyaankuis.`data`.viewmodel.PertanyaanKuisVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PertanyaanKuisActivity :
    BaseActivity<ActivityPertanyaanKuisBinding>(R.layout.activity_pertanyaan_kuis) {
  private val viewModel: PertanyaanKuisVM by viewModels<PertanyaanKuisVM>()

  private val REQUEST_CODE_JAWABAN_KUIS_ACTIVITY: Int = 672


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pertanyaanKuisVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLoremipsumdol.setOnClickListener {
      val destIntent = JawabanKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JAWABAN_KUIS_ACTIVITY)
    }
    binding.txtFrame209.setOnClickListener {
      val destIntent = JawabanKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JAWABAN_KUIS_ACTIVITY)
    }
    binding.linearColumnloremipsumdolOne.setOnClickListener {
      val destIntent = JawabanKuisActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_JAWABAN_KUIS_ACTIVITY)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PERTANYAAN_KUIS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PertanyaanKuisActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
