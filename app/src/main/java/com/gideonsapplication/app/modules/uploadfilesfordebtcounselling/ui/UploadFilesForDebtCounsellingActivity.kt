package com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityUploadFilesForDebtCounsellingBinding
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.model.SpinnerGroupNinetyFiveModel
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.model.SpinnerGroupNinetyThreeModel
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.viewmodel.UploadFilesForDebtCounsellingVM
import kotlin.String
import kotlin.Unit

class UploadFilesForDebtCounsellingActivity :
    BaseActivity<ActivityUploadFilesForDebtCounsellingBinding>(R.layout.activity_upload_files_for_debt_counselling)
    {
  private val viewModel: UploadFilesForDebtCounsellingVM by
      viewModels<UploadFilesForDebtCounsellingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerGroupNinetyThreeList.value = mutableListOf(
    SpinnerGroupNinetyThreeModel("Item1"),
    SpinnerGroupNinetyThreeModel("Item2"),
    SpinnerGroupNinetyThreeModel("Item3"),
    SpinnerGroupNinetyThreeModel("Item4"),
    SpinnerGroupNinetyThreeModel("Item5")
    )
    val spinnerGroupNinetyThreeAdapter =
    SpinnerGroupNinetyThreeAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNinetyThreeList.value?:
    mutableListOf())
    binding.spinnerGroupNinetyThree.adapter = spinnerGroupNinetyThreeAdapter
    viewModel.spinnerGroupNinetyFiveList.value = mutableListOf(
    SpinnerGroupNinetyFiveModel("Item1"),
    SpinnerGroupNinetyFiveModel("Item2"),
    SpinnerGroupNinetyFiveModel("Item3"),
    SpinnerGroupNinetyFiveModel("Item4"),
    SpinnerGroupNinetyFiveModel("Item5")
    )
    val spinnerGroupNinetyFiveAdapter =
    SpinnerGroupNinetyFiveAdapter(this,R.layout.spinner_item,viewModel.spinnerGroupNinetyFiveList.value?:
    mutableListOf())
    binding.spinnerGroupNinetyFive.adapter = spinnerGroupNinetyFiveAdapter
    binding.uploadFilesForDebtCounsellingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "UPLOAD_FILES_FOR_DEBT_COUNSELLING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, UploadFilesForDebtCounsellingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
