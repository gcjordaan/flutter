package com.gideonsapplication.app.modules.consolidatemydebt.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.ConsolidateMyDebtModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventyFiveModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventyNineModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventySevenModel
import com.gideonsapplication.app.modules.consolidatemydebt.`data`.model.SpinnerGroupSeventyThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ConsolidateMyDebtVM : ViewModel(), KoinComponent {
  val consolidateMyDebtModel: MutableLiveData<ConsolidateMyDebtModel> =
      MutableLiveData(ConsolidateMyDebtModel())

  var navArguments: Bundle? = null

  val spinnerGroupSeventyThreeList: MutableLiveData<MutableList<SpinnerGroupSeventyThreeModel>> =
      MutableLiveData()

  val spinnerGroupSeventyFiveList: MutableLiveData<MutableList<SpinnerGroupSeventyFiveModel>> =
      MutableLiveData()

  val spinnerGroupSeventySevenList: MutableLiveData<MutableList<SpinnerGroupSeventySevenModel>> =
      MutableLiveData()

  val spinnerGroupSeventyNineList: MutableLiveData<MutableList<SpinnerGroupSeventyNineModel>> =
      MutableLiveData()
}
