package com.agender.app.modules.materialdetailkuis.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.materialdetailkuis.`data`.model.MaterialDetailKuisModel
import org.koin.core.KoinComponent

class MaterialDetailKuisVM : ViewModel(), KoinComponent {
  val materialDetailKuisModel: MutableLiveData<MaterialDetailKuisModel> =
      MutableLiveData(MaterialDetailKuisModel())

  var navArguments: Bundle? = null
}
