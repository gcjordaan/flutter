package com.gideonsapplication.app.modules.consolidatemydebtupload.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityConsolidateMyDebtUploadBinding
import com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.model.SpinnerGroupEightyNineModel
import com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.model.SpinnerGroupNinetyOneModel
import com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.viewmodel.ConsolidateMyDebtUploadVM
import kotlin.String
import kotlin.Unit

class ConsolidateMyDebtUploadActivity :
    BaseActivity<ActivityConsolidateMyDebtUploadBinding>(R.layout.activity_consolidate_my_debt_upload)
    {
  private val viewModel: ConsolidateMyDebtUploadVM by viewModels<ConsolidateMyDebtUploadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupEightyNineList.value = mutableListOf(
    SpinnerGroupEightyNineModel("Item1"),
    SpinnerGroupEightyNineModel("Item2"),
    SpinnerGroupEightyNineModel("Item3"),
    SpinnerGroupEightyNineModel("Item4"),
    SpinnerGroupEightyNineModel("Item5")
    )
    val spinnerGroupEightyNineAdapter =
    SpinnerGroupEightyNineAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupEightyNineList.value?:
    mutableListOf())
    binding.spinnerGroupEightyNine.adapter = spinnerGroupEightyNineAdapter
    viewModel.spinnerGroupNinetyOneList.value = mutableListOf(
    SpinnerGroupNinetyOneModel("Item1"),
    SpinnerGroupNinetyOneModel("Item2"),
    SpinnerGroupNinetyOneModel("Item3"),
    SpinnerGroupNinetyOneModel("Item4"),
    SpinnerGroupNinetyOneModel("Item5")
    )
    val spinnerGroupNinetyOneAdapter =
    SpinnerGroupNinetyOneAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNinetyOneList.value?:
    mutableListOf())
    binding.spinnerGroupNinetyOne.adapter = spinnerGroupNinetyOneAdapter
    binding.consolidateMyDebtUploadVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "CONSOLIDATE_MY_DEBT_UPLOAD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConsolidateMyDebtUploadActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
