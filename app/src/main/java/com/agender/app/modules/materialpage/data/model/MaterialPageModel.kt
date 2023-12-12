package com.agender.app.modules.materialpage.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class MaterialPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDetailmateri: String? = MyApp.getInstance().resources.getString(R.string.lbl_detail_materi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPengenalanKese: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pengenalan_kese)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mulailah_perjal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaterial: String? = MyApp.getInstance().resources.getString(R.string.lbl_material)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDampakKesetara: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dampak_kesetara)
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
  var txtTransformasiBu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_transformasi_bu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangkahlangkah: String? =
      MyApp.getInstance().resources.getString(R.string.msg_langkah_langkah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameFortyValue: String? = null
)
