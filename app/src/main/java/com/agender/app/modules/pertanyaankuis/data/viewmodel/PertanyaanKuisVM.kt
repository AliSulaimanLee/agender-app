package com.agender.app.modules.pertanyaankuis.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.pertanyaankuis.`data`.model.PertanyaanKuisModel
import org.koin.core.KoinComponent

class PertanyaanKuisVM : ViewModel(), KoinComponent {
  val pertanyaanKuisModel: MutableLiveData<PertanyaanKuisModel> =
      MutableLiveData(PertanyaanKuisModel())

  var navArguments: Bundle? = null
}
