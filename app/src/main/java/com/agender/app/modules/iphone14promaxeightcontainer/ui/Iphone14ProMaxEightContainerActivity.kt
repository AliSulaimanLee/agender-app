package com.agender.app.modules.iphone14promaxeightcontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityIphone14ProMaxEightContainerBinding
import com.agender.app.extensions.loadFragment
import com.agender.app.modules.iphone14promaxeight.ui.Iphone14ProMaxEightFragment
import com.agender.app.modules.iphone14promaxeightcontainer.`data`.viewmodel.Iphone14ProMaxEightContainerVM
import com.agender.app.modules.iphone14promaxnine.ui.Iphone14ProMaxNineActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Iphone14ProMaxEightContainerActivity :
    BaseActivity<ActivityIphone14ProMaxEightContainerBinding>(R.layout.activity_iphone_14_pro_max_eight_container)
    {
  private val viewModel: Iphone14ProMaxEightContainerVM by
      viewModels<Iphone14ProMaxEightContainerVM>()

  private val REQUEST_CODE_IPHONE14PRO_MAX_NINE_ACTIVITY: Int = 823

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
    binding.txtEksplore.setOnClickListener {
      val destIntent = Iphone14ProMaxNineActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14PRO_MAX_NINE_ACTIVITY)
    }
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


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, Iphone14ProMaxEightContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
