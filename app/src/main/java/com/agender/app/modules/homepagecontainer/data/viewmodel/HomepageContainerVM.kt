package com.agender.app.modules.homepagecontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.homepagecontainer.`data`.model.HomepageContainerModel
import org.koin.core.KoinComponent

class HomepageContainerVM : ViewModel(), KoinComponent {
  val homepageContainerModel: MutableLiveData<HomepageContainerModel> =
      MutableLiveData(HomepageContainerModel())

  var navArguments: Bundle? = null
}
