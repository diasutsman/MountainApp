package com.diasandfahri.mountainapp.ui

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.diasandfahri.mountainapp.adapter.HikersAdapter
import com.diasandfahri.mountainapp.adapter.HorizontalMountainAdapter
import com.diasandfahri.mountainapp.data.HikersData
import com.diasandfahri.mountainapp.data.MountainsData
import com.dicoding.mountainapp.R
import com.dicoding.mountainapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.rvHorizontalMountains.apply {
            setHasFixedSize(true)
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
                adapter = HorizontalMountainAdapter(MountainsData.listMountains)
        }
        binding.rvHikersWords.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = HikersAdapter(HikersData.listHikersData)
        }
        binding.navigationPlacesList.setOnClickListener { view ->
            view.findNavController().navigate(R.id.navigation_places_list)

        }

        binding.btnPp.setOnClickListener { view ->
            view.findNavController().navigate(R.id.navigation_account)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}