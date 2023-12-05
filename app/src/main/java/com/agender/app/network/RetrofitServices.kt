package com.agender.app.network

import com.agender.app.network.models.createlogin.CreateLoginRequest
import com.agender.app.network.models.createlogin.CreateLoginResponse
import com.agender.app.network.models.createregister.CreateRegisterRequest
import com.agender.app.network.models.createregister.CreateRegisterResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitServices {
  @POST("/device/auth/login")
  suspend fun createLogin(@Header("Content-Type") contentType: String?, @Body
      createLoginRequest: CreateLoginRequest?): CreateLoginResponse

  @POST("/device/auth/register")
  suspend fun createRegister(@Header("Content-Type") contentType: String?, @Body
      createRegisterRequest: CreateRegisterRequest?): CreateRegisterResponse
}

const val BASE_URL: String = "https://nodedemo.dhiwise.co"
