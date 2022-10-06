package com.gideonsapplication.app.modules.debtcounsellingstatusone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityDebtCounsellingStatusOneBinding
import com.gideonsapplication.app.modules.debtcounsellingstatusone.`data`.viewmodel.DebtCounsellingStatusOneVM
import kotlin.String
import kotlin.Unit

class DebtCounsellingStatusOneActivity :
    BaseActivity<ActivityDebtCounsellingStatusOneBinding>(R.layout.activity_debt_counselling_status_one)
    {
  private val viewModel: DebtCounsellingStatusOneVM by viewModels<DebtCounsellingStatusOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.debtCounsellingStatusOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DEBT_COUNSELLING_STATUS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DebtCounsellingStatusOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
