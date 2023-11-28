package com.agender.app.modules.iphone14promaxeight.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.iphone14promaxeight.`data`.model.GridrectanglesixTwoRowModel
import com.agender.app.modules.iphone14promaxeight.`data`.model.Iphone14ProMaxEightModel
import com.agender.app.modules.iphone14promaxeight.`data`.model.ListrectanglesixRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Iphone14ProMaxEightVM : ViewModel(), KoinComponent {
  val iphone14ProMaxEightModel: MutableLiveData<Iphone14ProMaxEightModel> =
      MutableLiveData(Iphone14ProMaxEightModel())

  var navArguments: Bundle? = null

  val listrectanglesixList: MutableLiveData<MutableList<ListrectanglesixRowModel>> =
      MutableLiveData(mutableListOf())

  val gridrectanglesixTwoList: MutableLiveData<MutableList<GridrectanglesixTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
