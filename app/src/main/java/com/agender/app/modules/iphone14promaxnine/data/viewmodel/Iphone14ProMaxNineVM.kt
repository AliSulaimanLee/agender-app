package com.agender.app.modules.iphone14promaxnine.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxnine.`data`.model.Iphone14ProMaxNineModel
import org.koin.core.KoinComponent

class Iphone14ProMaxNineVM : ViewModel(), KoinComponent {
  val iphone14ProMaxNineModel: MutableLiveData<Iphone14ProMaxNineModel> =
      MutableLiveData(Iphone14ProMaxNineModel())

  var navArguments: Bundle? = null
}
