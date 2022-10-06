package com.gideonsapplication.app.modules.creditscore.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class CreditScoreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtReflectscredit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reflects_credit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)

)
