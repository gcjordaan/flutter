package com.gideonsapplication.app.modules.splashscreen.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.msg_nbcleanslate_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_login2)
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
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_with_experience)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTakethefirst: String? =
      MyApp.getInstance().resources.getString(R.string.msg_take_the_first)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDNUMBER: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_number)

)
