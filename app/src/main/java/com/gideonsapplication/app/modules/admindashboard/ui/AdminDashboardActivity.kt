package com.gideonsapplication.app.modules.admindashboard.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.appcomponents.views.DatePickerFragment
import com.gideonsapplication.app.databinding.ActivityAdminDashboardBinding
import com.gideonsapplication.app.modules.admindashboard.`data`.viewmodel.AdminDashboardVM
import java.util.Date
import kotlin.String
import kotlin.Unit

class AdminDashboardActivity :
    BaseActivity<ActivityAdminDashboardBinding>(R.layout.activity_admin_dashboard) {
  private val viewModel: AdminDashboardVM by viewModels<AdminDashboardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adminDashboardVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearNavigationelem2.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearNavigationelem2(selectedDate)
      }
    }
  }

  private fun onDateSelectedLinearNavigationelem2(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "ADMIN_DASHBOARD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AdminDashboardActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
