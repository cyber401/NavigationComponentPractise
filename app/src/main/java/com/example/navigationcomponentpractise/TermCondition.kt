package com.example.navigationcomponentpractise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponentpractise.databinding.FragmentWelcomeBinding
import com.example.navigationcomponentpractise.databinding.SettingFragmentBinding
import com.example.navigationcomponentpractise.databinding.TermConditionBinding

class TermCondition : Fragment() {
    private lateinit var binding: TermConditionBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.term_condition, container, false)
        return binding.root
    }


}