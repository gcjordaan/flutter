package com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.base.BaseActivity
import com.gideonsapplication.app.databinding.ActivitySelectDateForConsultantToContactYouBinding
import com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.model.ListfiveRowModel
import com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.viewmodel.SelectDateForConsultantToContactYouVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SelectDateForConsultantToContactYouActivity :
    BaseActivity<ActivitySelectDateForConsultantToContactYouBinding>(R.layout.activity_select_date_for_consultant_to_contact_you)
    {
  private val viewModel: SelectDateForConsultantToContactYouVM by
      viewModels<SelectDateForConsultantToContactYouVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listfiveAdapter = ListfiveAdapter(viewModel.listfiveList.value?:mutableListOf())
    binding.recyclerListfive.adapter = listfiveAdapter
    listfiveAdapter.setOnItemClickListener(
    object : ListfiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListfiveRowModel) {
        onClickRecyclerListfive(view, position, item)
      }
    }
    )
    viewModel.listfiveList.observe(this) {
      listfiveAdapter.updateData(it)
    }
    binding.selectDateForConsultantToContactYouVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListfive(
    view: View,
    position: Int,
    item: ListfiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SELECT_DATE_FOR_CONSULTANT_TO_CONTACT_YOU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SelectDateForConsultantToContactYouActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
