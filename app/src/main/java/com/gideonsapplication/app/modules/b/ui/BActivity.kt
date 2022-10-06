package com.gideonsapplication.app.modules.b.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivityBBinding
import com.gideonsapplication.app.modules.b.`data`.viewmodel.BVM
import kotlin.String
import kotlin.Unit

class BActivity : BaseActivity<ActivityBBinding>(R.layout.activity_b) {
  private val viewModel: BVM by viewModels<BVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "B_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
