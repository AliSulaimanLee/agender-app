package com.agender.app.modules.iphone14promaxeightcontainer.ui

import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxEightContainerBinding
import com.agender.app.extensions.loadFragment
import com.agender.app.modules.iphone14promaxeight.ui.Iphone14ProMaxEightFragment
import com.agender.app.modules.iphone14promaxeightcontainer.`data`.viewmodel.Iphone14ProMaxEightContainerVM
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxEightContainerActivity :
    BaseActivity<ActivityIphone14ProMaxEightContainerBinding>(R.layout.activity_iphone_14_pro_max_eight_container)
    {
  private val viewModel: Iphone14ProMaxEightContainerVM by
      viewModels<Iphone14ProMaxEightContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxEightContainerVM = viewModel
    val destFragment = Iphone14ProMaxEightFragment.getInstance(null)
    this.loadFragment(
        R.id.fragmentContainer,
        destFragment,
        bundle = destFragment.arguments, 
        tag = Iphone14ProMaxEightFragment.TAG, 
        addToBackStack = false, 
        add = false, 
        enter = null, 
        exit = null, 
        )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnhome.setOnClickListener {
      val destFragment = Iphone14ProMaxEightFragment.getInstance(null)
      this.loadFragment(
          R.id.fragmentContainer,
          destFragment,
          bundle = destFragment.arguments, 
          tag = Iphone14ProMaxEightFragment.TAG, 
          addToBackStack = true, 
          add = false, 
          enter = null, 
          exit = null, 
          )
    }
  }

  companion object {
    const val TAG: String = "IPHONE14PRO_MAX_EIGHT_CONTAINER_ACTIVITY"

  }
}
