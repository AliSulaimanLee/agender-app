package com.agender.app.modules.iphone14promaxfive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxfive.`data`.model.Iphone14ProMaxFiveModel
import org.koin.core.KoinComponent

class Iphone14ProMaxFiveVM : ViewModel(), KoinComponent {
  val iphone14ProMaxFiveModel: MutableLiveData<Iphone14ProMaxFiveModel> =
      MutableLiveData(Iphone14ProMaxFiveModel())

  var navArguments: Bundle? = null
}
