package com.gideonsapplication.app.modules.selectservice.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.selectservice.`data`.model.SelectServiceModel
import org.koin.core.KoinComponent

class SelectServiceVM : ViewModel(), KoinComponent {
  val selectServiceModel: MutableLiveData<SelectServiceModel> =
      MutableLiveData(SelectServiceModel())

  var navArguments: Bundle? = null
}
