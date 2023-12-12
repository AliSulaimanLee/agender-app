package com.agender.app.modules.materialdetailvideo.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class MaterialDetailVideoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVideomateri: String? = MyApp.getInstance().resources.getString(R.string.lbl_video_materi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMengapakesetar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mengapa_kesetar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_video_ini_mengg)

)
