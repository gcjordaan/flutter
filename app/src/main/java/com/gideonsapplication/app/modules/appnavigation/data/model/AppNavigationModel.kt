package com.gideonsapplication.app.modules.appnavigation.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSplashScreen: String? = MyApp.getInstance().resources.getString(R.string.lbl_splash_screen)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMFAVerification: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mfa_verificatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectService: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_select_service)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_four)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt4B: String? = MyApp.getInstance().resources.getString(R.string.lbl_4b)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsolidateMyDebt: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consolidate_my2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsolidateMyDebtUpload: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consolidate_my3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsolidateMyDebtStatus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consolidate_my4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsolidateMyDebtStatusOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consolidate_my5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConsolidateMyDebtStatusTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_consolidate_my6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUpForDebtCounselling: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_for_deb2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUploadFilesForDebtCounselling: String? =
      MyApp.getInstance().resources.getString(R.string.msg_upload_files_fo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebtCounsellingStatusTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_debt_counsellin4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebtCounsellingStatus: String? =
      MyApp.getInstance().resources.getString(R.string.msg_debt_counsellin5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDebtCounsellingStatusOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_debt_counsellin6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectDateForConsultantToContactYou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_date_for)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreditScore: String? = MyApp.getInstance().resources.getString(R.string.lbl_credit_score)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdminDashboard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_admin_dashboard2)

)
