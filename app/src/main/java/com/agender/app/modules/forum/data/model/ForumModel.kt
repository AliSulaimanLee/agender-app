package com.agender.app.modules.forum.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class ForumModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForum: String? = MyApp.getInstance().resources.getString(R.string.lbl_forum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameFourValue: String? = null
)
