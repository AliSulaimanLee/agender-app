package com.agender.app.modules.materialdetailkuis.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class MaterialDetailKuisModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKuis: String? = MyApp.getInstance().resources.getString(R.string.lbl_kuis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_kuis_pengenala)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHaiapakahkam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hai_apakah_kam)

)
