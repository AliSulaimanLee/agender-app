package com.agender.app.modules.iphone14promaxsix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxsix.`data`.model.Iphone14ProMaxSixModel
import org.koin.core.KoinComponent

class Iphone14ProMaxSixVM : ViewModel(), KoinComponent {
  val iphone14ProMaxSixModel: MutableLiveData<Iphone14ProMaxSixModel> =
      MutableLiveData(Iphone14ProMaxSixModel())

  var navArguments: Bundle? = null
}
