package com.agender.app.modules.forum.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseFragment
import com.agender.app.databinding.FragmentForumBinding
import com.agender.app.modules.forum.`data`.model.ForumRowModel
import com.agender.app.modules.forum.`data`.viewmodel.ForumVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ForumFragment : BaseFragment<FragmentForumBinding>(R.layout.fragment_forum) {
  private val viewModel: ForumVM by viewModels<ForumVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val forumAdapter = ForumAdapter(viewModel.forumList.value?:mutableListOf())
    binding.recyclerForum.adapter = forumAdapter
    forumAdapter.setOnItemClickListener(
    object : ForumAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ForumRowModel) {
        onClickRecyclerForum(view, position, item)
      }
    }
    )
    viewModel.forumList.observe(requireActivity()) {
      forumAdapter.updateData(it)
    }
    binding.forumVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerForum(
    view: View,
    position: Int,
    item: ForumRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FORUM_FRAGMENT"


    fun getInstance(bundle: Bundle?): ForumFragment {
      val fragment = ForumFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
