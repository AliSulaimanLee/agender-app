package com.agender.app.modules.signuppage.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAgender: String? = MyApp.getInstance().resources.getString(R.string.lbl_agender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_create_your_acc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrsigninwit: String? = MyApp.getInstance().resources.getString(R.string.msg_or_sign_in_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwoValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTenValue: String? = null
)
