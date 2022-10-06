package com.gideonsapplication.app.modules.signin.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoaNe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_a_ne)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbetterWayto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_better_way_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNUMBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRememebrme: String? = MyApp.getInstance().resources.getString(R.string.lbl_rememebr_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignuphere: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up_here)

)
