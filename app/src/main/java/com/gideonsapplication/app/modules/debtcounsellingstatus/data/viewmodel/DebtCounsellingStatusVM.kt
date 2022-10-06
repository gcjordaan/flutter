package com.gideonsapplication.app.modules.debtcounsellingstatus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.debtcounsellingstatus.`data`.model.DebtCounsellingStatusModel
import org.koin.core.KoinComponent

class DebtCounsellingStatusVM : ViewModel(), KoinComponent {
  val debtCounsellingStatusModel: MutableLiveData<DebtCounsellingStatusModel> =
      MutableLiveData(DebtCounsellingStatusModel())

  var navArguments: Bundle? = null
}
