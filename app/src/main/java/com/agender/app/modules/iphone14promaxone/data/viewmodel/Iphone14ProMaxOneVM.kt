package com.agender.app.modules.iphone14promaxone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxone.`data`.model.Iphone14ProMaxOneModel
import org.koin.core.KoinComponent

class Iphone14ProMaxOneVM : ViewModel(), KoinComponent {
  val iphone14ProMaxOneModel: MutableLiveData<Iphone14ProMaxOneModel> =
      MutableLiveData(Iphone14ProMaxOneModel())

  var navArguments: Bundle? = null
}
