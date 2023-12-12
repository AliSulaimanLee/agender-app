package com.agender.app.modules.introductiontwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.introductiontwo.`data`.model.IntroductionTwoModel
import org.koin.core.KoinComponent

class IntroductionTwoVM : ViewModel(), KoinComponent {
  val introductionTwoModel: MutableLiveData<IntroductionTwoModel> =
      MutableLiveData(IntroductionTwoModel())

  var navArguments: Bundle? = null
}
