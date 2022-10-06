package com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListfiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNine: String? = MyApp.getInstance().resources.getString(R.string.lbl_9)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTen: String? = MyApp.getInstance().resources.getString(R.string.lbl_10)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEleven: String? = MyApp.getInstance().resources.getString(R.string.lbl_11)

)
