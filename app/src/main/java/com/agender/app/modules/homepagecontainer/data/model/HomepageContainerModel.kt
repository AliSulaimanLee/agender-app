package com.agender.app.modules.homepagecontainer.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageContainerModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMateri: String? = MyApp.getInstance().resources.getString(R.string.lbl_materi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForum: String? = MyApp.getInstance().resources.getString(R.string.lbl_forum)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
