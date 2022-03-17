package com.reformist.recordbook.ui.auth

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.reformist.recordbook.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }
}