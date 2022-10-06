package com.gideonsapplication.app.modules.consolidatemydebtupload.`data`.model

import com.gideonsapplication.app.R
import com.gideonsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ConsolidateMyDebtUploadModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_to_apply_for_de)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDocumentSubmis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_document_submis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDDocumentBac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_id_document_bac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProofofReside: String? =
      MyApp.getInstance().resources.getString(R.string.msg_proof_of_reside)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTermAndCondition: String? =
      MyApp.getInstance().resources.getString(R.string.msg_i_have_read_and)

)
