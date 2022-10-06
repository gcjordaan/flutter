package com.gideonsapplication.app.modules.debtcounsellingstatusone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.debtcounsellingstatusone.`data`.model.DebtCounsellingStatusOneModel
import org.koin.core.KoinComponent

class DebtCounsellingStatusOneVM : ViewModel(), KoinComponent {
  val debtCounsellingStatusOneModel: MutableLiveData<DebtCounsellingStatusOneModel> =
      MutableLiveData(DebtCounsellingStatusOneModel())

  var navArguments: Bundle? = null
}
