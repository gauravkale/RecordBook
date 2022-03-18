package com.reformist.recordbook.data.network

import com.reformist.recordbook.data.responses.AddCustomerResponse
import com.reformist.recordbook.data.responses.LoginResponse
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface AddCustomerApi : BaseApi {

    @FormUrlEncoded
    @POST("addCustomer")
    suspend fun addCustomer(
        @Field("name") name: String,
        @Field("cust_type") cust_type: String,
        @Field("village") village: String,
        @Field("mobile") mobile: String,
        @Field("alternet_mobile") alternet_mobile: String
    ): AddCustomerResponse
}
