package com.agender.app.modules.gameshootthewordone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.gameshootthewordone.`data`.model.GameShootTheWordOneModel
import org.koin.core.KoinComponent

class GameShootTheWordOneVM : ViewModel(), KoinComponent {
  val gameShootTheWordOneModel: MutableLiveData<GameShootTheWordOneModel> =
      MutableLiveData(GameShootTheWordOneModel())

  var navArguments: Bundle? = null
}
