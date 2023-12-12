package com.agender.app.modules.materialpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.materialpage.`data`.model.MaterialPageModel
import org.koin.core.KoinComponent

class MaterialPageVM : ViewModel(), KoinComponent {
  val materialPageModel: MutableLiveData<MaterialPageModel> = MutableLiveData(MaterialPageModel())

  var navArguments: Bundle? = null
}
