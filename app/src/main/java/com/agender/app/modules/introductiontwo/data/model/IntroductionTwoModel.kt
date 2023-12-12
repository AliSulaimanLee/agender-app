package com.agender.app.modules.introductiontwo.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class IntroductionTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMengenalikeset: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mengenali_keset)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKeseteraangend: String? =
      MyApp.getInstance().resources.getString(R.string.msg_keseteraan_gend)

)
