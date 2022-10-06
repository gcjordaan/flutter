package com.gideonsapplication.app.modules.consolidatemydebtstatus.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.consolidatemydebtstatus.`data`.model.ConsolidateMyDebtStatusModel
import org.koin.core.KoinComponent

class ConsolidateMyDebtStatusVM : ViewModel(), KoinComponent {
  val consolidateMyDebtStatusModel: MutableLiveData<ConsolidateMyDebtStatusModel> =
      MutableLiveData(ConsolidateMyDebtStatusModel())

  var navArguments: Bundle? = null
}
