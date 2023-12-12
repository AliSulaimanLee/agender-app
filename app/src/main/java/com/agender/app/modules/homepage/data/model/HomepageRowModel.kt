package com.agender.app.modules.homepage.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPengenalan: String? = MyApp.getInstance().resources.getString(R.string.lbl_pengenalan)
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
