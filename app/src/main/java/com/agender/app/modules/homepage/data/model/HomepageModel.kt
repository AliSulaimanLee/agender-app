package com.agender.app.modules.homepage.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class HomepageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHiJames: String? = MyApp.getInstance().resources.getString(R.string.lbl_hi_james)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJadilahpejuang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jadilah_pejuang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkhirakhirini: String? =
      MyApp.getInstance().resources.getString(R.string.msg_akhir_akhir_ini)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFrameThirteen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_implementasi_ke)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameFourValue: String? = null
)
