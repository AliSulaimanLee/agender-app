package com.agender.app.modules.introductionthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.introductionthree.`data`.model.IntroductionThreeModel
import org.koin.core.KoinComponent

class IntroductionThreeVM : ViewModel(), KoinComponent {
  val introductionThreeModel: MutableLiveData<IntroductionThreeModel> =
      MutableLiveData(IntroductionThreeModel())

  var navArguments: Bundle? = null
}
