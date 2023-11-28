package com.agender.app.modules.iphone14promaxthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxthree.`data`.model.Iphone14ProMaxThreeModel
import org.koin.core.KoinComponent

class Iphone14ProMaxThreeVM : ViewModel(), KoinComponent {
  val iphone14ProMaxThreeModel: MutableLiveData<Iphone14ProMaxThreeModel> =
      MutableLiveData(Iphone14ProMaxThreeModel())

  var navArguments: Bundle? = null
}
