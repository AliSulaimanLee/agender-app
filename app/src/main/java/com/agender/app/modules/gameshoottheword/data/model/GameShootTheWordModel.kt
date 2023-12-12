package com.agender.app.modules.gameshoottheword.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class GameShootTheWordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_musnahkan_diksi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFEMINIS: String? = MyApp.getInstance().resources.getString(R.string.lbl_feminis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEQUALITY: String? = MyApp.getInstance().resources.getString(R.string.lbl_equality)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPATRIARKI: String? = MyApp.getInstance().resources.getString(R.string.lbl_patriarki)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEQUITY: String? = MyApp.getInstance().resources.getString(R.string.lbl_equity)

)
