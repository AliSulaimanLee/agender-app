package com.agender.app.modules.kuislulus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.kuislulus.`data`.model.KuisLulusModel
import org.koin.core.KoinComponent

class KuisLulusVM : ViewModel(), KoinComponent {
  val kuisLulusModel: MutableLiveData<KuisLulusModel> = MutableLiveData(KuisLulusModel())

  var navArguments: Bundle? = null
}
