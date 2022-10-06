package com.gideonsapplication.app.modules.selectservice.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SelectServiceModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLOGIN: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_log_out)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_hi_monique_wha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_to_qualify_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDEBTCONSOLIDAT: String? =
      MyApp.getInstance().resources.getString(R.string.msg_debt_consolidat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_debt_counsellin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdolOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)

)
