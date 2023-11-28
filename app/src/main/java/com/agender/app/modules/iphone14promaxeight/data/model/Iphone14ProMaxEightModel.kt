package com.agender.app.modules.iphone14promaxeight.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ProMaxEightModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiJames: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_james)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBeaniceperso: String? =
      MyApp.getInstance().resources.getString(R.string.msg_be_a_nice_perso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlyexplor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recently_explor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameThirteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameFourteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorem_ipsum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameFourValue: String? = null
)
