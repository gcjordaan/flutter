package com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SignUpForDebtCounsellingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_to_apply_for_de2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtApplicantDetai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_applicant_detai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonthlyincome: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_monthly_income)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMonthlyliving: String? =
      MyApp.getInstance().resources.getString(R.string.msg_monthly_living)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguageOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_total_debt_amou)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotsurewhich: String? =
      MyApp.getInstance().resources.getString(R.string.msg_not_sure_which)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClickhere: String? = MyApp.getInstance().resources.getString(R.string.lbl_click_here)

)
