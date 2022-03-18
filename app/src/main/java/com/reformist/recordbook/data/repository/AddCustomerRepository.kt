package com.reformist.recordbook.data.repository

import com.reformist.recordbook.data.UserPreferences
import com.reformist.recordbook.data.network.AddCustomerApi
import com.reformist.recordbook.data.network.AuthApi
import javax.inject.Inject

class AddCustomerRepository @Inject constructor(
    private val api: AddCustomerApi,
    private val preferences: UserPreferences
) : BaseRepository(api){

    suspend fun addCustomer(
        name: String,
        cust_type: String,
        village: String,
        mobile: String,
        alternet_mobile: String,

    ) = safeApiCall {
        api.addCustomer(name, cust_type,village,mobile,alternet_mobile)
    }
}