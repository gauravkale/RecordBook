package com.reformist.recordbook.ui.home

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.reformist.recordbook.R
import com.reformist.recordbook.data.UserPreferences
import com.reformist.recordbook.ui.auth.AuthActivity
import com.reformist.recordbook.ui.startNewActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var userPreferences: UserPreferences

    private val viewModel by viewModels<HomeViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun performLogout() = lifecycleScope.launch {
        viewModel.logout()
        userPreferences.clear()
        startNewActivity(AuthActivity::class.java)
    }
}