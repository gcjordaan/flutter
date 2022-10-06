package com.gideonsapplication.app.modules.debtcounsellingstatusone.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DebtCounsellingStatusOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_your_applicatio4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWecanaddsens: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_can_add_sens)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_earn_r100_off)

)
