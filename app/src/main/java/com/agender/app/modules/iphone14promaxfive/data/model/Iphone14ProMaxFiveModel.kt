package com.agender.app.modules.iphone14promaxfive.`data`.model

import com.agender.app.R
import com.agender.app.appcomponents.di.MyApp
import kotlin.String

data class Iphone14ProMaxFiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLearnmoreabou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_learn_more_abou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnonlineplatf: String? =
      MyApp.getInstance().resources.getString(R.string.msg_an_online_platf)

)
