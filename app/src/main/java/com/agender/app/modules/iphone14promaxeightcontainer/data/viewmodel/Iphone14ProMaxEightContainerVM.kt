package com.agender.app.modules.iphone14promaxeightcontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxeightcontainer.`data`.model.Iphone14ProMaxEightContainerModel
import org.koin.core.KoinComponent

class Iphone14ProMaxEightContainerVM : ViewModel(), KoinComponent {
  val iphone14ProMaxEightContainerModel: MutableLiveData<Iphone14ProMaxEightContainerModel> =
      MutableLiveData(Iphone14ProMaxEightContainerModel())

  var navArguments: Bundle? = null
}
