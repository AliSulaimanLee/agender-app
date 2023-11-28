package com.agender.app.modules.iphone14promaxten.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxten.`data`.model.Iphone14ProMaxTenModel
import org.koin.core.KoinComponent

class Iphone14ProMaxTenVM : ViewModel(), KoinComponent {
  val iphone14ProMaxTenModel: MutableLiveData<Iphone14ProMaxTenModel> =
      MutableLiveData(Iphone14ProMaxTenModel())

  var navArguments: Bundle? = null
}
