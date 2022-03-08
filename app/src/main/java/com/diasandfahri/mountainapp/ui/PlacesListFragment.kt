package com.diasandfahri.mountainapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.diasandfahri.mountainapp.adapter.PlacesListAdapter
import com.diasandfahri.mountainapp.data.MountainsData
import com.diasandfahri.mountainapp.databinding.FragmentPlacesListBinding

class PlacesListFragment : Fragment() {

    private var _binding: FragmentPlacesListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPlacesListBinding.inflate(inflater, container, false)
        binding.rvPlacesList.apply {
            adapter = PlacesListAdapter(MountainsData.listMountains)
            layoutManager = LinearLayoutManager(requireContext())
        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}