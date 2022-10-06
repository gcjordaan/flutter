package com.gideonsapplication.app.modules.debtcounsellingstatus.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DebtCounsellingStatusModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_your_applicatio3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWecanaddsens: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_can_add_sens)

)
