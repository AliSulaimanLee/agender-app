package com.agender.app.modules.iphone14promaxtwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.agender.app.appcomponents.utility.PreferenceHelper
import com.agender.app.modules.iphone14promaxtwo.`data`.model.Iphone14ProMaxTwoModel
import com.agender.app.network.models.createlogin.CreateLoginRequest
import com.agender.app.network.models.createlogin.CreateLoginResponse
import com.agender.app.network.repository.NetworkRepository
import com.agender.app.network.resources.Response
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import kotlin.Boolean
import kotlin.Unit
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class Iphone14ProMaxTwoVM : ViewModel(), KoinComponent {
  val iphone14ProMaxTwoModel: MutableLiveData<Iphone14ProMaxTwoModel> =
      MutableLiveData(Iphone14ProMaxTwoModel())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()


  private val networkRepository: NetworkRepository by inject()

  val createLoginLiveData: MutableLiveData<Response<CreateLoginResponse>> =
      MutableLiveData<Response<CreateLoginResponse>>()


  private val prefs: PreferenceHelper by inject()

  lateinit var googleAuthResponse: GoogleSignInAccount

  fun callCreateLoginApi(): Unit {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createLoginLiveData.postValue(
      networkRepository.createLogin(
      contentType = """application/json""",
      createLoginRequest = CreateLoginRequest(
      password = iphone14ProMaxTwoModel.value?.etGroupTwoValue,
      username = iphone14ProMaxTwoModel.value?.etGroupOneValue)
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateLoginResponse(response: CreateLoginResponse): Unit {
    val iphone14ProMaxTwoModelValue = iphone14ProMaxTwoModel.value ?:Iphone14ProMaxTwoModel()
    prefs.setUsername(response.data?.username)
    iphone14ProMaxTwoModel.value = iphone14ProMaxTwoModelValue
  }
}
