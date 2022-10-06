package com.gideonsapplication.app.modules.debtcounsellingstatus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityDebtCounsellingStatusBinding
import com.gideonsapplication.app.modules.debtcounsellingstatus.`data`.viewmodel.DebtCounsellingStatusVM
import kotlin.String
import kotlin.Unit

class DebtCounsellingStatusActivity :
    BaseActivity<ActivityDebtCounsellingStatusBinding>(R.layout.activity_debt_counselling_status) {
  private val viewModel: DebtCounsellingStatusVM by viewModels<DebtCounsellingStatusVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.debtCounsellingStatusVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "DEBT_COUNSELLING_STATUS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DebtCounsellingStatusActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
