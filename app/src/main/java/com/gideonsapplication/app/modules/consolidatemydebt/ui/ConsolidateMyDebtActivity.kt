package com.gideonsapplication.app.modules.consolidatemydebt.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityConsolidateMyDebtBinding
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventyFiveModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventyNineModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventySevenModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventyThreeModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.viewmodel.ConsolidateMyDebtVM
import kotlin.String
import kotlin.Unit

class ConsolidateMyDebtActivity :
    BaseActivity<ActivityConsolidateMyDebtBinding>(R.layout.activity_consolidate_my_debt) {
  private val viewModel: ConsolidateMyDebtVM by viewModels<ConsolidateMyDebtVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupSeventyThreeList.value = mutableListOf(
    SpinnerGroupSeventyThreeModel("Item1"),
    SpinnerGroupSeventyThreeModel("Item2"),
    SpinnerGroupSeventyThreeModel("Item3"),
    SpinnerGroupSeventyThreeModel("Item4"),
    SpinnerGroupSeventyThreeModel("Item5")
    )
    val spinnerGroupSeventyThreeAdapter =
    SpinnerGroupSeventyThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSeventyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyThree.adapter = spinnerGroupSeventyThreeAdapter
    viewModel.spinnerGroupSeventyFiveList.value = mutableListOf(
    SpinnerGroupSeventyFiveModel("Item1"),
    SpinnerGroupSeventyFiveModel("Item2"),
    SpinnerGroupSeventyFiveModel("Item3"),
    SpinnerGroupSeventyFiveModel("Item4"),
    SpinnerGroupSeventyFiveModel("Item5")
    )
    val spinnerGroupSeventyFiveAdapter =
    SpinnerGroupSeventyFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSeventyFiveList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyFive.adapter = spinnerGroupSeventyFiveAdapter
    viewModel.spinnerGroupSeventySevenList.value = mutableListOf(
    SpinnerGroupSeventySevenModel("Item1"),
    SpinnerGroupSeventySevenModel("Item2"),
    SpinnerGroupSeventySevenModel("Item3"),
    SpinnerGroupSeventySevenModel("Item4"),
    SpinnerGroupSeventySevenModel("Item5")
    )
    val spinnerGroupSeventySevenAdapter =
    SpinnerGroupSeventySevenAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSeventySevenList.value?:
    mutableListOf())
    binding.spinnerGroupSeventySeven.adapter = spinnerGroupSeventySevenAdapter
    viewModel.spinnerGroupSeventyNineList.value = mutableListOf(
    SpinnerGroupSeventyNineModel("Item1"),
    SpinnerGroupSeventyNineModel("Item2"),
    SpinnerGroupSeventyNineModel("Item3"),
    SpinnerGroupSeventyNineModel("Item4"),
    SpinnerGroupSeventyNineModel("Item5")
    )
    val spinnerGroupSeventyNineAdapter =
    SpinnerGroupSeventyNineAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupSeventyNineList.value?:
    mutableListOf())
    binding.spinnerGroupSeventyNine.adapter = spinnerGroupSeventyNineAdapter
    binding.consolidateMyDebtVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONSOLIDATE_MY_DEBT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsolidateMyDebtActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
