package com.example.navigationcomponentpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentpractise.databinding.FragmentLogInScreenBinding

class LogInScreen : Fragment() {
    private lateinit var binding:FragmentLogInScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_log_in_screen,  container, false)
        binding.button.setOnClickListener {
            val name = binding.editTextPersonName.text.toString()
            val action = LogInScreenDirections.actionLogInScreenToWelcomeFragment(name)
            findNavController().navigate(action)
        }
        return binding.root
    }


}