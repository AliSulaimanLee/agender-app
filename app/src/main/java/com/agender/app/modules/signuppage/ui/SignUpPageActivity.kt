package com.agender.app.modules.signuppage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.appcomponents.di.MyApp
import com.agender.app.appcomponents.googleauth.GoogleHelper
import com.agender.app.databinding.ActivitySignUpPageBinding
import com.agender.app.extensions.alert
import com.agender.app.extensions.isJSONObject
import com.agender.app.extensions.neutralButton
import com.agender.app.firestore.models.User
import com.agender.app.modules.loginpage.ui.LogInPageActivity
import com.agender.app.modules.signuppage.`data`.viewmodel.SignUpPageVM
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class SignUpPageActivity : BaseActivity<ActivitySignUpPageBinding>(R.layout.activity_sign_up_page) {
  private val viewModel: SignUpPageVM by viewModels<SignUpPageVM>()

  private lateinit var googleLogin: GoogleHelper

  private val REQUEST_CODE_LOG_IN_PAGE_ACTIVITY: Int = 953

  private val firestoreRef: FirebaseFirestore = Firebase.firestore

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpPageVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGroupSeven.setOnClickListener {
        googleLogin.login()
      }
      binding.txtConfirmation.setOnClickListener {
        val destIntent = LogInPageActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_LOG_IN_PAGE_ACTIVITY)
      }
      binding.btnSignUp.setOnClickListener {
        firestoreRef
        .collection("User")
        .add(User().apply {
          this.email = viewModel.signUpPageModel.value?.etGroupOneValue
              this.password = viewModel.signUpPageModel.value?.etGroupTwoValue
          })
          .addOnSuccessListener { documentReference ->
            onSuccessBtnSignUpStore(documentReference)
          }
          .addOnFailureListener { exception ->
            onErrorBtnSignUpStore(exception)
          }
        }
      }

      private fun onSuccessBtnSignUpStore(result: DocumentReference?) {
        val destIntent = LogInPageActivity.getIntent(this, null)
        startActivityForResult(destIntent, REQUEST_CODE_LOG_IN_PAGE_ACTIVITY)
      }

      private fun onErrorBtnSignUpStore(exception: Exception) {
        when(exception) {
          is HttpException -> {
            val errorBody = exception.response()?.errorBody()?.string()
            val errorObject = if (errorBody != null  && errorBody.isJSONObject())
                JSONObject(errorBody) else JSONObject()
            val errMessage = MyApp.getInstance().getString(R.string.lbl_error)
            this@SignUpPageActivity.alert(MyApp.getInstance().getString(R.string.lbl_error),errMessage) {
              neutralButton {
              }
            }
          }
        }
      }

      companion object {
        const val TAG: String = "SIGN_UP_PAGE_ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, SignUpPageActivity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
