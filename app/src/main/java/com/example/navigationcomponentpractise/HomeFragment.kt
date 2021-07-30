package com.example.navigationcomponentpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.navigationcomponentpractise.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

            // Inflate the layout for this fragment using DataBinding
            binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
            binding.logIn.setOnClickListener {
                val action = HomeFragmentDirections.actionHomeFragmentToLogInScreen()
                findNavController().navigate(action)   //with Safe args
//              findNavController().navigate(R.id.action_homeFragment_to_logInScreen) // without Safe args

            }
            return binding.root
    }
}