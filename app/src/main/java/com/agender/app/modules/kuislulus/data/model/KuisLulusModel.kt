package com.agender.app.modules.kuislulus.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class KuisLulusModel(
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
  var txtEighty: String? = MyApp.getInstance().resources.getString(R.string.lbl_80)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatkamume: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_kamu_me)

)
