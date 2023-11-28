package com.agender.app.modules.iphone14promaxeight.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class GridrectanglesixTwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatisgender: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_is_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_5_videos_3_ar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)

)
