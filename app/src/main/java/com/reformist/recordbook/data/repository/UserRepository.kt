package com.reformist.recordbook.data.repository

import com.reformist.recordbook.data.network.UserApi
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val api: UserApi
) : BaseRepository(api) {

    suspend fun getUser() = safeApiCall { api.getUser() }

}