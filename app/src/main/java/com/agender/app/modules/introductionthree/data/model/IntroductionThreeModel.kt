package com.agender.app.modules.introductionthree.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class IntroductionThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPahamidantera: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pahami_dan_tera)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPahamidanteraOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pahami_dan_tera2)

)
