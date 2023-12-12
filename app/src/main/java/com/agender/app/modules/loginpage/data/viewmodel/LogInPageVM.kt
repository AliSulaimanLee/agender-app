package com.agender.app.modules.loginpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.loginpage.`data`.model.LogInPageModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class LogInPageVM : ViewModel(), KoinComponent {
  val logInPageModel: MutableLiveData<LogInPageModel> = MutableLiveData(LogInPageModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
