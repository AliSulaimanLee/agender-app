package com.agender.app.modules.jawabankuis.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.jawabankuis.`data`.model.JawabanKuisModel
import org.koin.core.KoinComponent

class JawabanKuisVM : ViewModel(), KoinComponent {
  val jawabanKuisModel: MutableLiveData<JawabanKuisModel> = MutableLiveData(JawabanKuisModel())

  var navArguments: Bundle? = null
}
