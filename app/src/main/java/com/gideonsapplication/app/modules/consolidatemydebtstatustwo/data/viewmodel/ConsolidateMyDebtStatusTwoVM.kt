package com.gideonsapplication.app.modules.consolidatemydebtstatustwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.consolidatemydebtstatustwo.`data`.model.ConsolidateMyDebtStatusTwoModel
import org.koin.core.KoinComponent

class ConsolidateMyDebtStatusTwoVM : ViewModel(), KoinComponent {
  val consolidateMyDebtStatusTwoModel: MutableLiveData<ConsolidateMyDebtStatusTwoModel> =
      MutableLiveData(ConsolidateMyDebtStatusTwoModel())

  var navArguments: Bundle? = null
}
