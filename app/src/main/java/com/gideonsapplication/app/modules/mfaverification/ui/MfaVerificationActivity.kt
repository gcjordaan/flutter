package com.gideonsapplication.app.modules.mfaverification.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityMfaVerificationBinding
import com.gideonsapplication.app.modules.mfaverification.`data`.viewmodel.MfaVerificationVM
import kotlin.String
import kotlin.Unit

class MfaVerificationActivity :
    BaseActivity<ActivityMfaVerificationBinding>(R.layout.activity_mfa_verification) {
  private val viewModel: MfaVerificationVM by viewModels<MfaVerificationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.mfaVerificationVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MFA_VERIFICATION_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MfaVerificationActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
