package com.diasandfahri.mountainapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.diasandfahri.mountainapp.data.Mountain
import com.dicoding.mountainapp.databinding.RowListMountainBinding

class PlacesListAdapter(private val listMountain: ArrayList<Mountain>) : RecyclerView.Adapter<PlacesListAdapter.PlacesListViewHolder>() {
    class PlacesListViewHolder(val binding: RowListMountainBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlacesListViewHolder(
        RowListMountainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PlacesListViewHolder, position: Int) {
        holder.binding.apply {
            with(listMountain[position]) {
                listName.text = name
                listImg.setImageResource(img)
                listLocation.text = location
            }
        }
    }

    override fun getItemCount() = listMountain.size
}