package com.agender.app.modules.kuistidaklulus.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class KuisTidakLulusModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKuis: String? = MyApp.getInstance().resources.getString(R.string.lbl_kuis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSkorAkhir: String? = MyApp.getInstance().resources.getString(R.string.lbl_skor_akhir)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFifty: String? = MyApp.getInstance().resources.getString(R.string.lbl_50)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_maaf_kamu_belum)

)
