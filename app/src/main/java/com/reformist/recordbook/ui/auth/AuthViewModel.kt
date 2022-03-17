package com.reformist.recordbook.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.reformist.recordbook.ui.base.BaseViewModel
import com.reformist.recordbook.data.network.Resource
import com.reformist.recordbook.data.repository.AuthRepository
import com.reformist.recordbook.data.responses.LoginResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val repository: AuthRepository
) : BaseViewModel(repository) {
    private val _loginResponse: MutableLiveData<Resource<LoginResponse>> = MutableLiveData()
    val loginResponse: LiveData<Resource<LoginResponse>>
        get() = _loginResponse

    fun login(
        email: String,
        password: String
    ) = viewModelScope.launch {
        _loginResponse.value = Resource.Loading
        _loginResponse.value = repository.login(email, password)
    }

    suspend fun saveAccessTokens(accessToken: String, refreshToken: String) {
        repository.saveAccessTokens(accessToken, refreshToken)
    }
}