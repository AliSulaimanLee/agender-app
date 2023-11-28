package com.agender.app.modules.iphone14promaxeight.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectanglesixRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroduction: String? = MyApp.getInstance().resources.getString(R.string.lbl_introduction)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChapterCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_chapter)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtChapterCounterOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_10_chapter)

)
