package com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.model.ListfiveRowModel
import com.gideonsapplication.app.modules.selectdateforconsultanttocontactyou.`data`.model.SelectDateForConsultantToContactYouModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SelectDateForConsultantToContactYouVM : ViewModel(), KoinComponent {
  val selectDateForConsultantToContactYouModel:
      MutableLiveData<SelectDateForConsultantToContactYouModel> =
      MutableLiveData(SelectDateForConsultantToContactYouModel())

  var navArguments: Bundle? = null

  val listfiveList: MutableLiveData<MutableList<ListfiveRowModel>> =
      MutableLiveData(mutableListOf())
}
