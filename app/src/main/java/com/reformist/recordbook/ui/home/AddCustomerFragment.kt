package com.reformist.recordbook.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.reformist.recordbook.R
import com.reformist.recordbook.databinding.FragmentAddCustomerBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class AddCustomerFragment : Fragment(R.layout.fragment_add_customer) {

    private lateinit var binding: FragmentAddCustomerBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddCustomerBinding.bind(view)
    }




}