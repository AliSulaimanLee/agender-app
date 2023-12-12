package com.agender.app.modules.masukgame.ui

import androidx.fragment.app.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseFragment
import com.agender.app.databinding.FragmentMasukGameBinding
import com.agender.app.modules.masukgame.`data`.viewmodel.MasukGameVM
import kotlin.String
import kotlin.Unit

class MasukGameFragment : BaseFragment<FragmentMasukGameBinding>(R.layout.fragment_masuk_game) {
  private val viewModel: MasukGameVM by viewModels<MasukGameVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.masukGameVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "MASUK_GAME_FRAGMENT"

  }
}
