package com.agender.app.modules.gameshootthewordone.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class GameShootTheWordOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSkorkamu: String? = MyApp.getInstance().resources.getString(R.string.lbl_skor_kamu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKamuberhasilm: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kamu_berhasil_m)

)
