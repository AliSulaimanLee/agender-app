package com.agender.app.modules.iphone14promaxeight.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseFragment
import com.agender.app.databinding.FragmentIphone14ProMaxEightBinding
import com.agender.app.modules.iphone14promaxeight.`data`.model.GridrectanglesixTwoRowModel
import com.agender.app.modules.iphone14promaxeight.`data`.model.ListrectanglesixRowModel
import com.agender.app.modules.iphone14promaxeight.`data`.viewmodel.Iphone14ProMaxEightVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxEightFragment :
    BaseFragment<FragmentIphone14ProMaxEightBinding>(R.layout.fragment_iphone_14_pro_max_eight) {
  private val viewModel: Iphone14ProMaxEightVM by viewModels<Iphone14ProMaxEightVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listrectanglesixAdapter =
    ListrectanglesixAdapter(viewModel.listrectanglesixList.value?:mutableListOf())
    binding.recyclerListrectanglesix.adapter = listrectanglesixAdapter
    listrectanglesixAdapter.setOnItemClickListener(
    object : ListrectanglesixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListrectanglesixRowModel) {
        onClickRecyclerListrectanglesix(view, position, item)
      }
    }
    )
    viewModel.listrectanglesixList.observe(requireActivity()) {
      listrectanglesixAdapter.updateData(it)
    }
    val gridrectanglesixTwoAdapter =
    GridrectanglesixTwoAdapter(viewModel.gridrectanglesixTwoList.value?:mutableListOf())
    binding.recyclerGridrectanglesixTwo.adapter = gridrectanglesixTwoAdapter
    gridrectanglesixTwoAdapter.setOnItemClickListener(
    object : GridrectanglesixTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : GridrectanglesixTwoRowModel) {
        onClickRecyclerGridrectanglesixTwo(view, position, item)
      }
    }
    )
    viewModel.gridrectanglesixTwoList.observe(requireActivity()) {
      gridrectanglesixTwoAdapter.updateData(it)
    }
    binding.iphone14ProMaxEightVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectanglesix(
    view: View,
    position: Int,
    item: ListrectanglesixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerGridrectanglesixTwo(
    view: View,
    position: Int,
    item: GridrectanglesixTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_EIGHT_FRAGMENT"


    fun getInstance(bundle: Bundle?): Iphone14ProMaxEightFragment {
      val fragment = Iphone14ProMaxEightFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
