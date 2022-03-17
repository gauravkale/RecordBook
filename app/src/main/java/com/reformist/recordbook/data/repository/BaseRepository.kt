package com.reformist.recordbook.data.repository

import com.reformist.recordbook.data.network.BaseApi
import com.reformist.recordbook.data.network.SafeApiCall

abstract class BaseRepository(private val api: BaseApi) : SafeApiCall {

    suspend fun logout() = safeApiCall {
        api.logout()
    }
}