package com.agender.app.modules.kuistidaklulus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.kuistidaklulus.`data`.model.KuisTidakLulusModel
import org.koin.core.KoinComponent

class KuisTidakLulusVM : ViewModel(), KoinComponent {
  val kuisTidakLulusModel: MutableLiveData<KuisTidakLulusModel> =
      MutableLiveData(KuisTidakLulusModel())

  var navArguments: Bundle? = null
}
