package com.gideonsapplication.app.modules.b.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class BModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoaNe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_a_ne)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbetterWayto: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_better_way_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hi_fullname_sur)

)
