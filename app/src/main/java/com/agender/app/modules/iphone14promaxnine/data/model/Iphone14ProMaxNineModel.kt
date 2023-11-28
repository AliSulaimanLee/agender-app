package com.agender.app.modules.iphone14promaxnine.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ProMaxNineModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMaterialDetail: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_material_detail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroductionto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introduction_to)
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
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMaterial: String? = MyApp.getInstance().resources.getString(R.string.lbl_material)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtySevenValue: String? = null
)
