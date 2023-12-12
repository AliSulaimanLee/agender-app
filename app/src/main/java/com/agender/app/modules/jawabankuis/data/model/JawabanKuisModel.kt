package com.agender.app.modules.jawabankuis.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class JawabanKuisModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKuis: String? = MyApp.getInstance().resources.getString(R.string.lbl_kuis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwentyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApayangdimaks: String? =
      MyApp.getInstance().resources.getString(R.string.msg_apa_yang_dimaks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pemberian_hak_h)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kesenjangan_gen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kondisi_di_mana)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_pemisahan_tugas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_diskriminasi_be)

)
