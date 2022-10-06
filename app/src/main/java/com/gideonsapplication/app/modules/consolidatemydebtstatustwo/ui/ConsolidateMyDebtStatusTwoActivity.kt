package com.gideonsapplication.app.modules.consolidatemydebtstatustwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityConsolidateMyDebtStatusTwoBinding
import com.gideonsapplication.app.modules.consolidatemydebtstatustwo.`data`.viewmodel.ConsolidateMyDebtStatusTwoVM
import kotlin.String
import kotlin.Unit

class ConsolidateMyDebtStatusTwoActivity :
    BaseActivity<ActivityConsolidateMyDebtStatusTwoBinding>(R.layout.activity_consolidate_my_debt_status_two)
    {
  private val viewModel: ConsolidateMyDebtStatusTwoVM by viewModels<ConsolidateMyDebtStatusTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.consolidateMyDebtStatusTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONSOLIDATE_MY_DEBT_STATUS_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsolidateMyDebtStatusTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
