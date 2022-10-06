package com.gideonsapplication.app.modules.debtcounsellingstatustwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.debtcounsellingstatustwo.`data`.model.DebtCounsellingStatusTwoModel
import org.koin.core.KoinComponent

class DebtCounsellingStatusTwoVM : ViewModel(), KoinComponent {
  val debtCounsellingStatusTwoModel: MutableLiveData<DebtCounsellingStatusTwoModel> =
      MutableLiveData(DebtCounsellingStatusTwoModel())

  var navArguments: Bundle? = null
}
