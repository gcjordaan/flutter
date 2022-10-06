package com.gideonsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityAppNavigationBinding
import com.gideonsapplication.app.modules.admindashboard.ui.AdminDashboardActivity
import com.gideonsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.gideonsapplication.app.modules.b.ui.BActivity
import com.gideonsapplication.app.modules.consolidatemydebt.ui.ConsolidateMyDebtActivity
import com.gideonsapplication.app.modules.consolidatemydebtstatus.ui.ConsolidateMyDebtStatusActivity
import com.gideonsapplication.app.modules.consolidatemydebtstatusone.ui.ConsolidateMyDebtStatusOneActivity
import com.gideonsapplication.app.modules.consolidatemydebtstatustwo.ui.ConsolidateMyDebtStatusTwoActivity
import com.gideonsapplication.app.modules.consolidatemydebtupload.ui.ConsolidateMyDebtUploadActivity
import com.gideonsapplication.app.modules.creditscore.ui.CreditScoreActivity
import com.gideonsapplication.app.modules.debtcounsellingstatus.ui.DebtCounsellingStatusActivity
import com.gideonsapplication.app.modules.debtcounsellingstatusone.ui.DebtCounsellingStatusOneActivity
import com.gideonsapplication.app.modules.debtcounsellingstatustwo.ui.DebtCounsellingStatusTwoActivity
import com.gideonsapplication.app.modules.four.ui.FourActivity
import com.gideonsapplication.app.modules.mfaverification.ui.MfaVerificationActivity
import com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.ui.SelectDateForConsultantToContactYouActivity
import com.gideonsapplication.app.modules.selectservice.ui.SelectServiceActivity
import com.gideonsapplication.app.modules.signin.ui.SignInActivity
import com.gideonsapplication.app.modules.signupfordebtcounselling.ui.SignUpForDebtCounsellingActivity
import com.gideonsapplication.app.modules.splashscreen.ui.SplashScreenActivity
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.ui.UploadFilesForDebtCounsellingActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDebtCounsellingStatusOne.setOnClickListener {
      val destIntent = DebtCounsellingStatusOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplashScreen.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUpForDebtCounselling.setOnClickListener {
      val destIntent = SignUpForDebtCounsellingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConsolidateMyDebt.setOnClickListener {
      val destIntent = ConsolidateMyDebtActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSelectService.setOnClickListener {
      val destIntent = SelectServiceActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDebtCounsellingStatus.setOnClickListener {
      val destIntent = DebtCounsellingStatusActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFour.setOnClickListener {
      val destIntent = FourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linear4B.setOnClickListener {
      val destIntent = BActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConsolidateMyDebtStatus.setOnClickListener {
      val destIntent = ConsolidateMyDebtStatusActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSelectDateForConsultantToContactYou.setOnClickListener {
      val destIntent = SelectDateForConsultantToContactYouActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearCreditScore.setOnClickListener {
      val destIntent = CreditScoreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMFAVerification.setOnClickListener {
      val destIntent = MfaVerificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConsolidateMyDebtStatusTwo.setOnClickListener {
      val destIntent = ConsolidateMyDebtStatusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearUploadFilesForDebtCounselling.setOnClickListener {
      val destIntent = UploadFilesForDebtCounsellingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAdminDashboard.setOnClickListener {
      val destIntent = AdminDashboardActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDebtCounsellingStatusTwo.setOnClickListener {
      val destIntent = DebtCounsellingStatusTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConsolidateMyDebtStatusOne.setOnClickListener {
      val destIntent = ConsolidateMyDebtStatusOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearConsolidateMyDebtUpload.setOnClickListener {
      val destIntent = ConsolidateMyDebtUploadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
