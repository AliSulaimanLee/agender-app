package com.agender.app.modules.masukgame.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.masukgame.`data`.model.MasukGameModel
import org.koin.core.KoinComponent

class MasukGameVM : ViewModel(), KoinComponent {
  val masukGameModel: MutableLiveData<MasukGameModel> = MutableLiveData(MasukGameModel())

  var navArguments: Bundle? = null
}
