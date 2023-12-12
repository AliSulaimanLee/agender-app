package com.agender.app.modules.introductionone.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class IntroductionOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPelajarikeseta: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pelajari_keseta)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlatformdigita: String? =
      MyApp.getInstance().resources.getString(R.string.msg_platform_digita)

)
