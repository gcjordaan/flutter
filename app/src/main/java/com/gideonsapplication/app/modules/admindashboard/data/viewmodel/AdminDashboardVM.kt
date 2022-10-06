package com.gideonsapplication.app.modules.admindashboard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.admindashboard.`data`.model.AdminDashboardModel
import org.koin.core.KoinComponent

class AdminDashboardVM : ViewModel(), KoinComponent {
  val adminDashboardModel: MutableLiveData<AdminDashboardModel> =
      MutableLiveData(AdminDashboardModel())

  var navArguments: Bundle? = null
}
