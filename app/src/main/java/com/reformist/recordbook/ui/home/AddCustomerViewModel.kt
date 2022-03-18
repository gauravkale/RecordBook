package com.reformist.recordbook.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.reformist.recordbook.data.network.Resource
import com.reformist.recordbook.data.repository.AddCustomerRepository
import com.reformist.recordbook.data.responses.AddCustomerResponse
import com.reformist.recordbook.data.responses.LoginResponse
import com.reformist.recordbook.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddCustomerViewModel @Inject constructor(
    private val repository: AddCustomerRepository
) : BaseViewModel(repository){

    private val _addCustomerResponse: MutableLiveData<Resource<AddCustomerResponse>> = MutableLiveData()
    val addCustomerResponse: LiveData<Resource<AddCustomerResponse>>
        get() = addCustomerResponse

    fun addCustomer(
        name: String,
        cust_type: String,
        village : String,
        mobile : String,
        alternet_mobile : String
    ) = viewModelScope.launch {
        _addCustomerResponse.value = Resource.Loading
        _addCustomerResponse.value = repository.addCustomer(name, cust_type,village,mobile,alternet_mobile)
    }
}