package com.agender.app.modules.masukgameone.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class MasukGameOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGame: String? = MyApp.getInstance().resources.getString(R.string.lbl_game)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSHOOTTHEWORD: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_shoot_the_word)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHaikamuyakin: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hai_kamu_yakin)

)
