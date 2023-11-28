package com.agender.app.modules.iphone14promaxfour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxfour.`data`.model.Iphone14ProMaxFourModel
import org.koin.core.KoinComponent

class Iphone14ProMaxFourVM : ViewModel(), KoinComponent {
  val iphone14ProMaxFourModel: MutableLiveData<Iphone14ProMaxFourModel> =
      MutableLiveData(Iphone14ProMaxFourModel())

  var navArguments: Bundle? = null
}
