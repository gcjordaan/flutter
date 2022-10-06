package com.gideonsapplication.app.modules.consolidatemydebtstatusone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.consolidatemydebtstatusone.`data`.model.ConsolidateMyDebtStatusOneModel
import org.koin.core.KoinComponent

class ConsolidateMyDebtStatusOneVM : ViewModel(), KoinComponent {
  val consolidateMyDebtStatusOneModel: MutableLiveData<ConsolidateMyDebtStatusOneModel> =
      MutableLiveData(ConsolidateMyDebtStatusOneModel())

  var navArguments: Bundle? = null
}
