package com.agender.app.modules.forum.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.forum.`data`.model.ForumModel
import com.agender.app.modules.forum.`data`.model.ForumRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ForumVM : ViewModel(), KoinComponent {
  val forumModel: MutableLiveData<ForumModel> = MutableLiveData(ForumModel())

  var navArguments: Bundle? = null

  val forumList: MutableLiveData<MutableList<ForumRowModel>> = MutableLiveData(mutableListOf())
}
