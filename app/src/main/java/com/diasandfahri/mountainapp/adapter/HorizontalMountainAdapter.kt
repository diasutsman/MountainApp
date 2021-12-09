package com.diasandfahri.mountainapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.diasandfahri.mountainapp.DetailActivity
import com.diasandfahri.mountainapp.R
import com.diasandfahri.mountainapp.data.App
import com.diasandfahri.mountainapp.data.Mountain
import com.diasandfahri.mountainapp.databinding.RowItemMountainBinding
import com.diasandfahri.mountainapp.toDetail

class HorizontalMountainAdapter(private val listMountains: ArrayList<Mountain>) :
    RecyclerView.Adapter<HorizontalMountainAdapter.HorizontalMountainViewholder>() {
    class HorizontalMountainViewholder(val binding: RowItemMountainBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): HorizontalMountainViewholder = HorizontalMountainViewholder(
        RowItemMountainBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: HorizontalMountainViewholder, position: Int) {
        holder.binding.apply {
            with(listMountains[position]) {
                nameRowMountain.text = App.res.getString(R.string.txt_name).format(name)
                locationRowMountain.text = location
                imgRowMountain.setImageResource(img)
                holder.itemView.setOnClickListener {
                    toDetail(it.context,
                        this,
                        App.res.getString(R.string.txt_welcome).format(nameRowMountain.text))
                }

            }
        }
    }

    override fun getItemCount() = listMountains.size
}