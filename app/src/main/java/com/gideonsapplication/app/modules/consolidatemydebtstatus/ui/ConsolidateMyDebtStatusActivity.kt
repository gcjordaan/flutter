package com.gideonsapplication.app.modules.consolidatemydebtstatus.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityConsolidateMyDebtStatusBinding
import com.gideonsapplication.app.modules.consolidatemydebtstatus.`data`.viewmodel.ConsolidateMyDebtStatusVM
import kotlin.String
import kotlin.Unit

class ConsolidateMyDebtStatusActivity :
    BaseActivity<ActivityConsolidateMyDebtStatusBinding>(R.layout.activity_consolidate_my_debt_status)
    {
  private val viewModel: ConsolidateMyDebtStatusVM by viewModels<ConsolidateMyDebtStatusVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.consolidateMyDebtStatusVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONSOLIDATE_MY_DEBT_STATUS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsolidateMyDebtStatusActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
