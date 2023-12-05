package com.agender.app.modules.iphone14promaxthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import com.agender.app.R
import com.agender.app.appcomponents.base.BaseActivity
import com.agender.app.appcomponents.di.MyApp
import com.agender.app.appcomponents.googleauth.GoogleHelper
import com.agender.app.databinding.ActivityIphone14ProMaxThreeBinding
import com.agender.app.extensions.NoInternetConnection
import com.agender.app.extensions.alert
import com.agender.app.extensions.hideKeyboard
import com.agender.app.extensions.isJSONObject
import com.agender.app.extensions.isValidEmail
import com.agender.app.extensions.isValidPassword
import com.agender.app.extensions.neutralButton
import com.agender.app.extensions.showProgressDialog
import com.agender.app.modules.iphone14promaxthree.`data`.viewmodel.Iphone14ProMaxThreeVM
import com.agender.app.modules.iphone14promaxtwo.ui.Iphone14ProMaxTwoActivity
import com.agender.app.network.models.createregister.CreateRegisterResponse
import com.agender.app.network.resources.ErrorResponse
import com.agender.app.network.resources.SuccessResponse
import com.google.android.material.snackbar.Snackbar
import java.lang.Exception
import kotlin.String
import kotlin.Unit
import org.json.JSONObject
import retrofit2.HttpException

class Iphone14ProMaxThreeActivity :
    BaseActivity<ActivityIphone14ProMaxThreeBinding>(R.layout.activity_iphone_14_pro_max_three) {
  private val viewModel: Iphone14ProMaxThreeVM by viewModels<Iphone14ProMaxThreeVM>()

  private lateinit var googleLogin: GoogleHelper

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.iphone14ProMaxThreeVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.imageGroupSeven.setOnClickListener {
        googleLogin.login()
      }
      binding.btnSignUp.setOnClickListener {
        if(
            viewModel.iphone14ProMaxThreeModel.value?.etGroupOneValue.
        isValidEmail(true)
            && viewModel.iphone14ProMaxThreeModel.value?.etGroupTwoValue.
        isValidPassword(true)) {
          this@Iphone14ProMaxThreeActivity.hideKeyboard()
          viewModel.callCreateRegisterApi()
        }
      }
    }

    override fun addObservers() {
      var progressDialog : AlertDialog? = null
      viewModel.progressLiveData.observe(this@Iphone14ProMaxThreeActivity) {
        if(it) {
          progressDialog?.dismiss()
          progressDialog = null
          progressDialog = this@Iphone14ProMaxThreeActivity.showProgressDialog()
        } else  {
          progressDialog?.dismiss()
        }
      }
      viewModel.createRegisterLiveData.observe(this@Iphone14ProMaxThreeActivity) {
        if(it is SuccessResponse) {
          val response = it.getContentIfNotHandled()
          onSuccessCreateRegister(it)
        } else if(it is ErrorResponse)  {
          onErrorCreateRegister(it.data ?:Exception())
        }
      }
    }

    private fun onSuccessCreateRegister(response: SuccessResponse<CreateRegisterResponse>) {
      viewModel.bindCreateRegisterResponse(response.data)
      val destIntent = Iphone14ProMaxTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }

    private fun onErrorCreateRegister(exception: Exception) {
      when(exception) {
        is NoInternetConnection -> {
          Snackbar.make(binding.root, exception.message?:"", Snackbar.LENGTH_LONG).show()
        }
        is HttpException -> {
          val errorBody = exception.response()?.errorBody()?.string()
          val errorObject = if (errorBody != null  && errorBody.isJSONObject())
              JSONObject(errorBody) else JSONObject()
          val errMessage = MyApp.getInstance().getString(R.string.lbl_error)
          this@Iphone14ProMaxThreeActivity.alert(MyApp.getInstance().getString(R.string.lbl_error),errMessage) {
            neutralButton {
            }
          }
        }
      }
    }

    companion object {
      const val TAG: String = "IPHONE14PRO_MAX_THREE_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, Iphone14ProMaxThreeActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
