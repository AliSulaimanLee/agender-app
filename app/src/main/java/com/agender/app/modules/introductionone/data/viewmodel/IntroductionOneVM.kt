package com.agender.app.modules.introductionone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.introductionone.`data`.model.IntroductionOneModel
import org.koin.core.KoinComponent

class IntroductionOneVM : ViewModel(), KoinComponent {
  val introductionOneModel: MutableLiveData<IntroductionOneModel> =
      MutableLiveData(IntroductionOneModel())

  var navArguments: Bundle? = null
}
