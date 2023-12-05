package com.agender.app.modules.iphone14promaxtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.appcomponents.di.MyApp
import com.agender.app.appcomponents.googleauth.GoogleHelper
import com.agender.app.databinding.ActivityIphone14ProMaxTwoBinding
import com.agender.app.extensions.NoInternetConnection
import com.agender.app.extensions.alert
import com.agender.app.extensions.hideKeyboard
import com.agender.app.extensions.isJSONObject
import com.agender.app.extensions.isValidEmail
import com.agender.app.extensions.isValidPassword
import com.agender.app.extensions.neutralButton
import com.agender.app.extensions.showProgressDialog
import com.agender.app.modules.iphone14promaxfour.ui.Iphone14ProMaxFourActivity
import com.agender.app.modules.iphone14promaxthree.ui.Iphone14ProMaxThreeActivity
import com.agender.app.modules.iphone14promaxtwo.`data`.viewmodel.Iphone14ProMaxTwoVM
import com.agender.app.network.models.createlogin.CreateLoginResponse
import com.agender.app.network.resources.ErrorResponse
import com.agender.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class Iphone14ProMaxTwoActivity :
    BaseActivity<ActivityIphone14ProMaxTwoBinding>(R.layout.activity_iphone_14_pro_max_two) {
  private val viewModel: Iphone14ProMaxTwoVM by viewModels<Iphone14ProMaxTwoVM>()

  private val REQUEST_CODE_IPHONE14PRO_MAX_FOUR_ACTIVITY: Int = 402


  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxTwoVM = viewModel
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
        if(
        viewModel.iphone14ProMaxTwoModel.value?.etGroupOneValue.
        isValidEmail(true)
        && viewModel.iphone14ProMaxTwoModel.value?.etGroupTwoValue.
        isValidPassword(true)) {
          this@Iphone14ProMaxTwoActivity.hideKeyboard()
          viewModel.callCreateLoginApi()
        }
      }
      binding.txtConfirmation.setOnClickListener {
        val destIntent = Iphone14ProMaxThreeActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    override fun addObservers(): Unit {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@Iphone14ProMaxTwoActivity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@Iphone14ProMaxTwoActivity.showProgressDialog()
        } else {
          progressDialog?.dismiss()
        }
      }
      viewModel.createLoginLiveData.observe(this@Iphone14ProMaxTwoActivity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateLogin(it)
        } else if(it is ErrorResponse) {
          onErrorCreateLogin(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateLogin(response: SuccessResponse<CreateLoginResponse>): Unit {
      viewModel.bindCreateLoginResponse(response.data)
      val destIntent = Iphone14ProMaxFourActivity.getIntent(this, null)
      startActivityForResult(destIntent, REQUEST_CODE_IPHONE14PRO_MAX_FOUR_ACTIVITY)
    }

    private fun onErrorCreateLogin(exception: Exception): Unit {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
          JSONObject(errorBody) else JSONObject()
          val errMessage = MyApp.getInstance().getString(R.string.lbl_error)
          this@Iphone14ProMaxTwoActivity.alert(MyApp.getInstance().getString(R.string.lbl_error),errMessage) {
            neutralButton {
            }
          }
        }
      }
    }

    companion object {
      const val TAG: String = "IPHONE14PRO_MAX_TWO_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone14ProMaxTwoActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
