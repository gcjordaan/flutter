package com.gideonsapplication.app.modules.signupfordebtcounselling.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivitySignUpForDebtCounsellingBinding
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightyFiveModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightyOneModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightySevenModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightyThreeModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.viewmodel.SignUpForDebtCounsellingVM
import kotlin.String
import kotlin.Unit

class SignUpForDebtCounsellingActivity :
    BaseActivity<ActivitySignUpForDebtCounsellingBinding>(R.layout.activity_sign_up_for_debt_counselling)
    {
  private val viewModel: SignUpForDebtCounsellingVM by viewModels<SignUpForDebtCounsellingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupEightyOneList.value = mutableListOf(
    SpinnerGroupEightyOneModel("Item1"),
    SpinnerGroupEightyOneModel("Item2"),
    SpinnerGroupEightyOneModel("Item3"),
    SpinnerGroupEightyOneModel("Item4"),
    SpinnerGroupEightyOneModel("Item5")
    )
    val spinnerGroupEightyOneAdapter =
    SpinnerGroupEightyOneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupEightyOneList.value?:
    mutableListOf())
    binding.spinnerGroupEightyOne.adapter = spinnerGroupEightyOneAdapter
    viewModel.spinnerGroupEightyThreeList.value = mutableListOf(
    SpinnerGroupEightyThreeModel("Item1"),
    SpinnerGroupEightyThreeModel("Item2"),
    SpinnerGroupEightyThreeModel("Item3"),
    SpinnerGroupEightyThreeModel("Item4"),
    SpinnerGroupEightyThreeModel("Item5")
    )
    val spinnerGroupEightyThreeAdapter =
    SpinnerGroupEightyThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupEightyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupEightyThree.adapter = spinnerGroupEightyThreeAdapter
    viewModel.spinnerGroupEightyFiveList.value = mutableListOf(
    SpinnerGroupEightyFiveModel("Item1"),
    SpinnerGroupEightyFiveModel("Item2"),
    SpinnerGroupEightyFiveModel("Item3"),
    SpinnerGroupEightyFiveModel("Item4"),
    SpinnerGroupEightyFiveModel("Item5")
    )
    val spinnerGroupEightyFiveAdapter =
    SpinnerGroupEightyFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupEightyFiveList.value?:
    mutableListOf())
    binding.spinnerGroupEightyFive.adapter = spinnerGroupEightyFiveAdapter
    viewModel.spinnerGroupEightySevenList.value = mutableListOf(
    SpinnerGroupEightySevenModel("Item1"),
    SpinnerGroupEightySevenModel("Item2"),
    SpinnerGroupEightySevenModel("Item3"),
    SpinnerGroupEightySevenModel("Item4"),
    SpinnerGroupEightySevenModel("Item5")
    )
    val spinnerGroupEightySevenAdapter =
    SpinnerGroupEightySevenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupEightySevenList.value?:
    mutableListOf())
    binding.spinnerGroupEightySeven.adapter = spinnerGroupEightySevenAdapter
    binding.signUpForDebtCounsellingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SIGN_UP_FOR_DEBT_COUNSELLING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpForDebtCounsellingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
