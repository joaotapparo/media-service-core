package com.liskovsoft.googlecommon.common.constants

import com.liskovsoft.googlecommon.common.constants.data.ConstantsResult
import com.liskovsoft.googlecommon.common.helpers.RetrofitHelper

internal object ConstantsService {
    private val mConstantsApi = RetrofitHelper.create(ConstantsApi::class.java)

    @JvmStatic
    // Fork: no remote constants.json from upstream (it picks the OAuth client for Drive backup).
    val constants: ConstantsResult? = null
}