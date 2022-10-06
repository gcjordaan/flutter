package com.gideonsapplication.app.modules.four.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FourModel(
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
  var txtFullnames: String? = MyApp.getInstance().resources.getString(R.string.lbl_full_names)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSurname: String? = MyApp.getInstance().resources.getString(R.string.lbl_surname)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContactnumber: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_contact_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailaddress: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_e_mail_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl)

)
