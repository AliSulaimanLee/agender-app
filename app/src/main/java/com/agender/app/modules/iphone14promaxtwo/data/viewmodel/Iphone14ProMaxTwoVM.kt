package com.agender.app.modules.iphone14promaxtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxtwo.`data`.model.Iphone14ProMaxTwoModel
import org.koin.core.KoinComponent

class Iphone14ProMaxTwoVM : ViewModel(), KoinComponent {
  val iphone14ProMaxTwoModel: MutableLiveData<Iphone14ProMaxTwoModel> =
      MutableLiveData(Iphone14ProMaxTwoModel())

  var navArguments: Bundle? = null
}
