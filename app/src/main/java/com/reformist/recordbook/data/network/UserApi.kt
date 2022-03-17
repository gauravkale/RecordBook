package com.reformist.recordbook.data.network

import com.reformist.recordbook.data.responses.LoginResponse
import retrofit2.http.GET

interface UserApi : BaseApi{
    @GET("user")
    suspend fun getUser(): LoginResponse
}