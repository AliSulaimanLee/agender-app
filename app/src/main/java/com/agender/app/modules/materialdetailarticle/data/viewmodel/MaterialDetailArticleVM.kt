package com.agender.app.modules.materialdetailarticle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.materialdetailarticle.`data`.model.MaterialDetailArticleModel
import org.koin.core.KoinComponent

class MaterialDetailArticleVM : ViewModel(), KoinComponent {
  val materialDetailArticleModel: MutableLiveData<MaterialDetailArticleModel> =
      MutableLiveData(MaterialDetailArticleModel())

  var navArguments: Bundle? = null
}
