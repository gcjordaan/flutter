package com.gideonsapplication.app.modules.consolidatemydebtstatusone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityConsolidateMyDebtStatusOneBinding
import com.gideonsapplication.app.modules.consolidatemydebtstatusone.`data`.viewmodel.ConsolidateMyDebtStatusOneVM
import kotlin.String
import kotlin.Unit

class ConsolidateMyDebtStatusOneActivity :
    BaseActivity<ActivityConsolidateMyDebtStatusOneBinding>(R.layout.activity_consolidate_my_debt_status_one)
    {
  private val viewModel: ConsolidateMyDebtStatusOneVM by viewModels<ConsolidateMyDebtStatusOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.consolidateMyDebtStatusOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONSOLIDATE_MY_DEBT_STATUS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsolidateMyDebtStatusOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
