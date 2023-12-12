package com.agender.app.modules.loginpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.appcomponents.di.MyApp
import com.agender.app.appcomponents.googleauth.GoogleHelper
import com.agender.app.databinding.ActivityLogInPageBinding
import com.agender.app.extensions.alert
import com.agender.app.extensions.isJSONObject
import com.agender.app.extensions.neutralButton
import com.agender.app.modules.introductionone.ui.IntroductionOneActivity
import com.agender.app.modules.loginpage.`data`.viewmodel.LogInPageVM
import com.agender.app.modules.signuppage.ui.SignUpPageActivity
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class LogInPageActivity : BaseActivity<ActivityLogInPageBinding>(R.layout.activity_log_in_page) {
  private val viewModel: LogInPageVM by viewModels<LogInPageVM>()

  private val firestoreRef: FirebaseFirestore = Firebase.firestore


  private val REQUEST_CODE_INTRODUCTION_ONE_ACTIVITY: Int = 595


  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.logInPageVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error ->

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGroupSeven.setOnClickListener {
        googleLogin.login()
      }
      binding.btnSignIn.setOnClickListener {
        val queryBtnSignIn = firestoreRef
        .collection("User")
        if(viewModel.logInPageModel.value?.etGroupOneValue != null) {
          queryBtnSignIn.whereEqualTo("email", viewModel.logInPageModel.value?.etGroupOneValue!!)
        }
        if(viewModel.logInPageModel.value?.etGroupTwoValue != null) {
          queryBtnSignIn.whereEqualTo("password", viewModel.logInPageModel.value?.etGroupTwoValue!!)
        }
        queryBtnSignIn.orderBy("Id", Query.Direction.DESCENDING)
        queryBtnSignIn.limit(1)
        queryBtnSignIn.get()
        .addOnSuccessListener { document ->
          onSuccessBtnSignInQuery(document)
        }
        .addOnFailureListener { exception ->
          onErrorBtnSignInQuery(exception)
        }
      }
      binding.txtConfirmation.setOnClickListener {
        val destIntent = SignUpPageActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    private fun onSuccessBtnSignInQuery(result: QuerySnapshot?): Unit {
      if (result == null) return
      val logInPageModelValue = viewModel.logInPageModel.value
      viewModel.logInPageModel.value = logInPageModelValue
      val destIntent = IntroductionOneActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_INTRODUCTION_ONE_ACTIVITY)
    }

    private fun onErrorBtnSignInQuery(exception: Exception): Unit {
      when(exception) {
        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
          JSONObject(errorBody) else JSONObject()
          val errMessage = MyApp.getInstance().getString(R.string.lbl_error)
          this@LogInPageActivity.alert(MyApp.getInstance().getString(R.string.lbl_error),errMessage) {
            neutralButton {
            }
          }
        }
      }
    }

    companion object {
      const val TAG: String = "LOG_IN_PAGE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LogInPageActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
