package com.agender.app.modules.materialdetailvideo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.materialdetailvideo.`data`.model.MaterialDetailVideoModel
import org.koin.core.KoinComponent

class MaterialDetailVideoVM : ViewModel(), KoinComponent {
  val materialDetailVideoModel: MutableLiveData<MaterialDetailVideoModel> =
      MutableLiveData(MaterialDetailVideoModel())

  var navArguments: Bundle? = null
}
