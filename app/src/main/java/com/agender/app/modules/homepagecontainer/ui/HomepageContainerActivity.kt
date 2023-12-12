package com.agender.app.modules.homepagecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.databinding.ActivityHomepageContainerBinding
import com.agender.app.extensions.loadFragment
import com.agender.app.modules.forum.ui.ForumFragment
import com.agender.app.modules.homepage.ui.HomepageFragment
import com.agender.app.modules.homepagecontainer.`data`.viewmodel.HomepageContainerVM
import com.agender.app.modules.materialpage.ui.MaterialPageActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomepageContainerActivity :
    BaseActivity<ActivityHomepageContainerBinding>(R.layout.activity_homepage_container) {
  private val viewModel: HomepageContainerVM by viewModels<HomepageContainerVM>()

  private val REQUEST_CODE_MATERIAL_PAGE_ACTIVITY: Int = 377


  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homepageContainerVM = viewModel
    val destFragment = HomepageFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomepageFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnvectorFive.setOnClickListener {
      val destIntent = MaterialPageActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_MATERIAL_PAGE_ACTIVITY)
    }
    binding.linearColumngroup.setOnClickListener {
      val destFragment = ForumFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ForumFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOMEPAGE_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomepageContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
