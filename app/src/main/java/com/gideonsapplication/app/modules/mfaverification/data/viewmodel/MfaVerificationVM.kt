package com.gideonsapplication.app.modules.mfaverification.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.gideonsapplication.app.modules.mfaverification.`data`.model.MfaVerificationModel
import org.koin.core.KoinComponent

class MfaVerificationVM : ViewModel(), KoinComponent {
  val mfaVerificationModel: MutableLiveData<MfaVerificationModel> =
      MutableLiveData(MfaVerificationModel())

  var navArguments: Bundle? = null
}
