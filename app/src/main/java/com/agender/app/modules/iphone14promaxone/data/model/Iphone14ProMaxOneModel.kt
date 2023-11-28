package com.agender.app.modules.iphone14promaxone.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ProMaxOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAgender: String? = MyApp.getInstance().resources.getString(R.string.lbl_agender)

)
