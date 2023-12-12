package com.agender.app.modules.forum.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class ForumRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEren: String? = MyApp.getInstance().resources.getString(R.string.lbl_eren)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_cara_menanggapi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTenTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt10menityangl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_10_menit_yang_l)

)
