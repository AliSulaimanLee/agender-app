package com.agender.app.modules.homepage.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class Homepage1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtApaitukesetar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apa_itu_kesetar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_2_video_1_art)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)

)
