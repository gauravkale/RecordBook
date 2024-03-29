package com.reformist.recordbook.ui.home

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.reformist.recordbook.R
import com.reformist.recordbook.data.network.Resource
import com.reformist.recordbook.data.responses.User
import com.reformist.recordbook.databinding.FragmentHomeBinding
import com.reformist.recordbook.ui.handleApiError
import com.reformist.recordbook.ui.logout
import com.reformist.recordbook.ui.visible
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment(R.layout.fragment_home) {
    private lateinit var binding: FragmentHomeBinding
    private val viewModel by viewModels<HomeViewModel>()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)

        val languages = resources.getStringArray(R.array.Customers)

        val adapter = ArrayAdapter(requireContext(),
            android.R.layout.simple_list_item_1, languages)
        binding.customerAutoComplete.setAdapter(adapter)

        binding.buttonInformation.setOnClickListener {
            openInfoPage()
        }

        binding.buttonSubmit.setOnClickListener {
            Toast.makeText(requireContext(),"Submit Click",Toast.LENGTH_SHORT).show()
        }
/*        binding.progressbar.visible(false)

        viewModel.getUser()

        viewModel.user.observe(viewLifecycleOwner, Observer {
            when (it) {
                is Resource.Success -> {
                    binding.progressbar.visible(false)
                    updateUI(it.value.user)
                }
                is Resource.Loading -> {
                    binding.progressbar.visible(true)
                }
                is Resource.Failure -> {
                    handleApiError(it)
                }
            }
        })

        binding.buttonLogout.setOnClickListener {
            logout()
        }*/
    }

    private fun openInfoPage() {
        Toast.makeText(requireContext(),"Information page open",Toast.LENGTH_SHORT).show()
    }

    /*private fun updateUI(user: User) {
        with(binding) {
            textViewId.text = user.id.toString()
            textViewName.text = user.name
            textViewEmail.text = user.email
        }
    }*/
}