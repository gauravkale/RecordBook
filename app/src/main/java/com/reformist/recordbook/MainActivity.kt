package com.reformist.recordbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.asLiveData
import com.reformist.recordbook.data.UserPreferences
import com.reformist.recordbook.ui.auth.AuthActivity
import com.reformist.recordbook.ui.home.HomeActivity
import com.reformist.recordbook.ui.startNewActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userPreferences = UserPreferences(this)

        userPreferences.accessToken.asLiveData().observe(this, Observer {
            val activity = if (it == null) AuthActivity::class.java else HomeActivity::class.java
            startNewActivity(activity)
        })
    }
}