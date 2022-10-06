package com.gideonsapplication.app.modules.consolidatemydebtstatustwo.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ConsolidateMyDebtStatusTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourapplicatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_applicatio2)
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
