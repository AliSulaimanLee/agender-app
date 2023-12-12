package com.agender.app.modules.materialdetailarticle.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class MaterialDetailArticleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtikelmateri: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_artikel_materi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMemahamiEsensi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_memahami_esensi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_artikel_ini_men)

)
