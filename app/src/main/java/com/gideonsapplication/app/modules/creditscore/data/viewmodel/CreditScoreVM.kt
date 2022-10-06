package com.gideonsapplication.app.modules.creditscore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.creditscore.`data`.model.CreditScoreModel
import org.koin.core.KoinComponent

class CreditScoreVM : ViewModel(), KoinComponent {
  val creditScoreModel: MutableLiveData<CreditScoreModel> = MutableLiveData(CreditScoreModel())

  var navArguments: Bundle? = null
}
