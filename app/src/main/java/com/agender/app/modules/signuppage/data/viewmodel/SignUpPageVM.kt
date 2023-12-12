package com.agender.app.modules.signuppage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.agender.app.modules.signuppage.`data`.model.SignUpPageModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import org.koin.core.KoinComponent

class SignUpPageVM : ViewModel(), KoinComponent {
  val signUpPageModel: MutableLiveData<SignUpPageModel> = MutableLiveData(SignUpPageModel())


  var navArguments: Bundle? = null


  lateinit var googleAuthResponse: GoogleSignInAccount
}
