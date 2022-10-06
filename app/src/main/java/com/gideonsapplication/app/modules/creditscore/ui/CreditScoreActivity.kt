package com.gideonsapplication.app.modules.creditscore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityCreditScoreBinding
import com.gideonsapplication.app.modules.creditscore.`data`.viewmodel.CreditScoreVM
import kotlin.String
import kotlin.Unit

class CreditScoreActivity : BaseActivity<ActivityCreditScoreBinding>(R.layout.activity_credit_score)
    {
  private val viewModel: CreditScoreVM by viewModels<CreditScoreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.creditScoreVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CREDIT_SCORE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CreditScoreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
