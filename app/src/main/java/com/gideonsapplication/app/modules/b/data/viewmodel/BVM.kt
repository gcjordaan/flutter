package com.gideonsapplication.app.modules.b.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.b.`data`.model.BModel
import org.koin.core.KoinComponent

class BVM : ViewModel(), KoinComponent {
  val bModel: MutableLiveData<BModel> = MutableLiveData(BModel())

  var navArguments: Bundle? = null
}
