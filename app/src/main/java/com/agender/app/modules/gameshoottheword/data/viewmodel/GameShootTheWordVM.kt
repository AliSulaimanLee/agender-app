package com.agender.app.modules.gameshoottheword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.gameshoottheword.`data`.model.GameShootTheWordModel
import org.koin.core.KoinComponent

class GameShootTheWordVM : ViewModel(), KoinComponent {
  val gameShootTheWordModel: MutableLiveData<GameShootTheWordModel> =
      MutableLiveData(GameShootTheWordModel())

  var navArguments: Bundle? = null
}
