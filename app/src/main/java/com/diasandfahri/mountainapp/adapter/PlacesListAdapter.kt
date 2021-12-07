package com.diasandfahri.mountainapp.adapter

import android.content.Intent
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.diasandfahri.mountainapp.DetailActivity
import com.diasandfahri.mountainapp.data.App
import com.diasandfahri.mountainapp.data.Mountain
import com.diasandfahri.mountainapp.toDetail
import com.dicoding.mountainapp.R
import com.dicoding.mountainapp.databinding.RowListMountainBinding

class PlacesListAdapter(private val listMountains: ArrayList<Mountain>) :
    RecyclerView.Adapter<PlacesListAdapter.PlacesListViewHolder>() {
    class PlacesListViewHolder(val binding: RowListMountainBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlacesListViewHolder(
        RowListMountainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PlacesListViewHolder, position: Int) {
        val system = Resources.getSystem()
        holder.binding.apply {
            with(listMountains[position]) {
                listName.text = "Mount %s".format(name)
                listImg.setImageResource(img)
                listLocation.text = location
                holder.itemView.setOnClickListener {
                    toDetail(it.context, this,"Welcome to %s".format(listName) )
                }
            }
        }
    }

    override fun getItemCount() = listMountains.size
}