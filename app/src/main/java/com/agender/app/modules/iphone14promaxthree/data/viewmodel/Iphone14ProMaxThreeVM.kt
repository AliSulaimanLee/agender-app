package com.agender.app.modules.iphone14promaxthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agender.app.appcomponents.utility.PreferenceHelper
import com.agender.app.modules.iphone14promaxthree.`data`.model.Iphone14ProMaxThreeModel
import com.agender.app.network.models.createregister.CreateRegisterRequest
import com.agender.app.network.models.createregister.CreateRegisterResponse
import com.agender.app.network.repository.NetworkRepository
import com.agender.app.network.resources.Response
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class Iphone14ProMaxThreeVM : ViewModel(), KoinComponent {
  val iphone14ProMaxThreeModel: MutableLiveData<Iphone14ProMaxThreeModel> =
      MutableLiveData(Iphone14ProMaxThreeModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount

  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createRegisterLiveData: MutableLiveData<Response<CreateRegisterResponse>> =
      MutableLiveData<Response<CreateRegisterResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateRegisterApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createRegisterLiveData.postValue(
      networkRepository.createRegister(
      contentType = """application/json""",
          createRegisterRequest = CreateRegisterRequest(
          password = iphone14ProMaxThreeModel.value?.etGroupTwoValue,
          username = iphone14ProMaxThreeModel.value?.etGroupOneValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateRegisterResponse(response: CreateRegisterResponse) {
    val iphone14ProMaxThreeModelValue = iphone14ProMaxThreeModel.value ?:Iphone14ProMaxThreeModel()
    prefs.setUsername(response.data?.username)
    iphone14ProMaxThreeModel.value = iphone14ProMaxThreeModelValue
  }
}
