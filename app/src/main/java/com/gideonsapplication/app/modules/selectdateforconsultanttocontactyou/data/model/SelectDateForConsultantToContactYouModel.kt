package com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SelectDateForConsultantToContactYouModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_please_select_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_mon_jan_13)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonth: String? = MyApp.getInstance().resources.getString(R.string.lbl_january_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtS: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtM: String? = MyApp.getInstance().resources.getString(R.string.lbl_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtT: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtW: String? = MyApp.getInstance().resources.getString(R.string.lbl_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_t)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtF: String? = MyApp.getInstance().resources.getString(R.string.lbl_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)

)
