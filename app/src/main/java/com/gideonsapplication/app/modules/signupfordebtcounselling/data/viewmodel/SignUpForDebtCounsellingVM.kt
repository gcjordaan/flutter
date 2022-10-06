package com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SignUpForDebtCounsellingModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightyFiveModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightyOneModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightySevenModel
import com.gideonsapplication.app.modules.signupfordebtcounselling.`data`.model.SpinnerGroupEightyThreeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SignUpForDebtCounsellingVM : ViewModel(), KoinComponent {
  val signUpForDebtCounsellingModel: MutableLiveData<SignUpForDebtCounsellingModel> =
      MutableLiveData(SignUpForDebtCounsellingModel())

  var navArguments: Bundle? = null

  val spinnerGroupEightyOneList: MutableLiveData<MutableList<SpinnerGroupEightyOneModel>> =
      MutableLiveData()

  val spinnerGroupEightyThreeList: MutableLiveData<MutableList<SpinnerGroupEightyThreeModel>> =
      MutableLiveData()

  val spinnerGroupEightyFiveList: MutableLiveData<MutableList<SpinnerGroupEightyFiveModel>> =
      MutableLiveData()

  val spinnerGroupEightySevenList: MutableLiveData<MutableList<SpinnerGroupEightySevenModel>> =
      MutableLiveData()
}
