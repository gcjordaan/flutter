package com.gideonsapplication.app.modules.admindashboard.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AdminDashboardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtADMINDashboard: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_admin_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSubmit: String? = MyApp.getInstance().resources.getString(R.string.lbl_submit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPeople: String? = MyApp.getInstance().resources.getString(R.string.lbl_people)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProjects: String? = MyApp.getInstance().resources.getString(R.string.lbl_projects)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCalendarOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_calendar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTraining: String? = MyApp.getInstance().resources.getString(R.string.lbl_training)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimesheet: String? = MyApp.getInstance().resources.getString(R.string.lbl_timesheet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtReports: String? = MyApp.getInstance().resources.getString(R.string.lbl_reports)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAdministration: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_administration)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelp: String? = MyApp.getInstance().resources.getString(R.string.lbl_help)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNavigationelemValue: String? = null
)
