package com.agender.app.modules.masukgame.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class MasukGameModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEren: String? = MyApp.getInstance().resources.getString(R.string.lbl_eren)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMateridiselesa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_materi_diselesa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundredTwelve: String? = MyApp.getInstance().resources.getString(R.string.lbl_812)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkumulasiskor: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_akumulasi_skor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSixHundredSeventyOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_671)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkumulasipoin: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_akumulasi_poin)

)
