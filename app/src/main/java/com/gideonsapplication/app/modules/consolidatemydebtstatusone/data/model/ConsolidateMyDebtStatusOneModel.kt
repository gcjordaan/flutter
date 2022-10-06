package com.gideonsapplication.app.modules.consolidatemydebtstatusone.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ConsolidateMyDebtStatusOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtYourapplicatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_applicatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWecanaddsens: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_can_add_sens)

)
