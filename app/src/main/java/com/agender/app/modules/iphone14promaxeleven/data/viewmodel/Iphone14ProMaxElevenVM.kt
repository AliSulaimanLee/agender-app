package com.agender.app.modules.iphone14promaxeleven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxeleven.`data`.model.Iphone14ProMaxElevenModel
import org.koin.core.KoinComponent

class Iphone14ProMaxElevenVM : ViewModel(), KoinComponent {
  val iphone14ProMaxElevenModel: MutableLiveData<Iphone14ProMaxElevenModel> =
      MutableLiveData(Iphone14ProMaxElevenModel())

  var navArguments: Bundle? = null
}
