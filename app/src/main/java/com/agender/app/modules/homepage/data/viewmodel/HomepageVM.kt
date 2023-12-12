package com.agender.app.modules.homepage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.homepage.`data`.model.Homepage1RowModel
import com.agender.app.modules.homepage.`data`.model.HomepageModel
import com.agender.app.modules.homepage.`data`.model.HomepageRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomepageVM : ViewModel(), KoinComponent {
  val homepageModel: MutableLiveData<HomepageModel> = MutableLiveData(HomepageModel())

  var navArguments: Bundle? = null

  val homepageList: MutableLiveData<MutableList<HomepageRowModel>> =
      MutableLiveData(mutableListOf())

  val homepage1List: MutableLiveData<MutableList<Homepage1RowModel>> =
      MutableLiveData(mutableListOf())
}
