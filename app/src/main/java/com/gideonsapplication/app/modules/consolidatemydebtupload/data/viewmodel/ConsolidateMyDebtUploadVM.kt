package com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.model.ConsolidateMyDebtUploadModel
import com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.model.SpinnerGroupEightyNineModel
import com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.model.SpinnerGroupNinetyOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ConsolidateMyDebtUploadVM : ViewModel(), KoinComponent {
  val consolidateMyDebtUploadModel: MutableLiveData<ConsolidateMyDebtUploadModel> =
      MutableLiveData(ConsolidateMyDebtUploadModel())

  var navArguments: Bundle? = null

  val spinnerGroupEightyNineList: MutableLiveData<MutableList<SpinnerGroupEightyNineModel>> =
      MutableLiveData()

  val spinnerGroupNinetyOneList: MutableLiveData<MutableList<SpinnerGroupNinetyOneModel>> =
      MutableLiveData()
}
