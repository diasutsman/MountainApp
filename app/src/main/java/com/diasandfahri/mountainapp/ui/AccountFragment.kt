package com.diasandfahri.mountainapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dicoding.mountainapp.R
import com.dicoding.mountainapp.databinding.FragmentAccountBinding
import com.dicoding.mountainapp.databinding.FragmentSearchBinding

class AccountFragment : Fragment() {
    private var _binding: FragmentAccountBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentAccountBinding.inflate(layoutInflater)
        binding.imageView.clipToOutline = true
        return binding.root
    }
}