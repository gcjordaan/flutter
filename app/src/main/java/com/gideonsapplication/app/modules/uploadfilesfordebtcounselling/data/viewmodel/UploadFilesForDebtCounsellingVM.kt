package com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.model.SpinnerGroupNinetyFiveModel
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.model.SpinnerGroupNinetyThreeModel
import com.gideonsapplication.app.modules.uploadfilesfordebtcounselling.`data`.model.UploadFilesForDebtCounsellingModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class UploadFilesForDebtCounsellingVM : ViewModel(), KoinComponent {
  val uploadFilesForDebtCounsellingModel: MutableLiveData<UploadFilesForDebtCounsellingModel> =
      MutableLiveData(UploadFilesForDebtCounsellingModel())

  var navArguments: Bundle? = null

  val spinnerGroupNinetyThreeList: MutableLiveData<MutableList<SpinnerGroupNinetyThreeModel>> =
      MutableLiveData()

  val spinnerGroupNinetyFiveList: MutableLiveData<MutableList<SpinnerGroupNinetyFiveModel>> =
      MutableLiveData()
}
