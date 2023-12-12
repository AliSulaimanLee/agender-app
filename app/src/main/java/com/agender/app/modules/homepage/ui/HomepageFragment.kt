package com.agender.app.modules.homepage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseFragment
import com.agender.app.databinding.FragmentHomepageBinding
import com.agender.app.modules.homepage.`data`.model.Homepage1RowModel
import com.agender.app.modules.homepage.`data`.model.HomepageRowModel
import com.agender.app.modules.homepage.`data`.viewmodel.HomepageVM
import com.agender.app.modules.materialpage.ui.MaterialPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageFragment : BaseFragment<FragmentHomepageBinding>(R.layout.fragment_homepage) {
  private val viewModel: HomepageVM by viewModels<HomepageVM>()

  private val REQUEST_CODE_MATERIAL_PAGE_ACTIVITY: Int = 207

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val homepageAdapter = HomepageAdapter(viewModel.homepageList.value?:mutableListOf())
    binding.recyclerHomepage.adapter = homepageAdapter
    homepageAdapter.setOnItemClickListener(
    object : HomepageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : HomepageRowModel) {
        onClickRecyclerHomepage(view, position, item)
      }
    }
    )
    viewModel.homepageList.observe(requireActivity()) {
      homepageAdapter.updateData(it)
    }
    val homepage1Adapter = Homepage1Adapter(viewModel.homepage1List.value?:mutableListOf())
    binding.recyclerHomepage1.adapter = homepage1Adapter
    homepage1Adapter.setOnItemClickListener(
    object : Homepage1Adapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Homepage1RowModel) {
        onClickRecyclerHomepage1(view, position, item)
      }
    }
    )
    viewModel.homepage1List.observe(requireActivity()) {
      homepage1Adapter.updateData(it)
    }
    binding.homepageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerHomepage(
    view: View,
    position: Int,
    item: HomepageRowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectanglesix ->  {
        onClickRecyclerHomepageLinearColumnrectanglesix(view, position, item)
      }
    }
  }

  fun onClickRecyclerHomepage1(
    view: View,
    position: Int,
    item: Homepage1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearColumnrectanglesixTwo ->  {
        val destIntent = MaterialPageActivity.getIntent(requireActivity(), null)
        startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
        requireActivity().onBackPressed()
      }
    }
  }

  fun onClickRecyclerHomepageLinearColumnrectanglesix(
    view: View,
    position: Int,
    item: HomepageRowModel
  ) {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 ->  {
        val destIntent = MaterialPageActivity.getIntent(requireActivity(), null)
        startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
        requireActivity().onBackPressed()
      }
      1 ->  {
        val destIntent = MaterialPageActivity.getIntent(requireActivity(), null)
        startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomepageFragment {
      val fragment = HomepageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
