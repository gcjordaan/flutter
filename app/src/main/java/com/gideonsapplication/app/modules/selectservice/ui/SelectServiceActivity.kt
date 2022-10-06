package com.gideonsapplication.app.modules.selectservice.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivitySelectServiceBinding
import com.gideonsapplication.app.modules.selectservice.`data`.viewmodel.SelectServiceVM
import kotlin.String
import kotlin.Unit

class SelectServiceActivity :
    BaseActivity<ActivitySelectServiceBinding>(R.layout.activity_select_service) {
  private val viewModel: SelectServiceVM by viewModels<SelectServiceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectServiceVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SELECT_SERVICE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelectServiceActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
