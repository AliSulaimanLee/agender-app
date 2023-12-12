package com.agender.app.modules.masukgameone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.masukgameone.`data`.model.MasukGameOneModel
import org.koin.core.KoinComponent

class MasukGameOneVM : ViewModel(), KoinComponent {
  val masukGameOneModel: MutableLiveData<MasukGameOneModel> = MutableLiveData(MasukGameOneModel())

  var navArguments: Bundle? = null
}
