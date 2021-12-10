package com.diasandfahri.mountainapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.diasandfahri.mountainapp.R
import com.diasandfahri.mountainapp.data.App
import com.diasandfahri.mountainapp.data.Mountain
import com.diasandfahri.mountainapp.databinding.RowListMountainBinding
import com.diasandfahri.mountainapp.toDetail

class PlacesListAdapter(private val listMountains: ArrayList<Mountain>) :
    RecyclerView.Adapter<PlacesListAdapter.PlacesListViewHolder>() {
    class PlacesListViewHolder(val binding: RowListMountainBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PlacesListViewHolder(
        RowListMountainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: PlacesListViewHolder, position: Int) {
        holder.binding.apply {
            with(listMountains[position]) {
                listName.text = App.res.getString(R.string.txt_name).format(name)
                listImg.setImageResource(img)
                listLocation.text = App.res.getString(locationStringRes)
                holder.itemView.setOnClickListener {
                    toDetail(it.context,
                        this,
                        App.res.getString(R.string.txt_welcome).format(listName.text))
                }
            }
        }
    }

    override fun getItemCount() = listMountains.size
}