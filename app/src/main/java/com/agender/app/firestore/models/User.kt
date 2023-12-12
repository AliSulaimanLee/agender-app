package com.agender.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.Int
import kotlin.String
import kotlin.jvm.JvmField

public class User {
  @JvmField
  @PropertyName("email")
  public var email: String? = null

  @JvmField
  @PropertyName("password")
  public var password: String? = null

  @JvmField
  @PropertyName("Id")
  public var id: Int? = null
}
