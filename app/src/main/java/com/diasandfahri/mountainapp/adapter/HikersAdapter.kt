package com.diasandfahri.mountainapp.adapter

import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.diasandfahri.mountainapp.data.Hikers
import com.dicoding.mountainapp.databinding.RowHikersWordsBinding

class HikersAdapter(private val listHikers: ArrayList<Hikers>) : RecyclerView.Adapter<HikersAdapter.HikersViewHolder>() {
    class HikersViewHolder(val binding: RowHikersWordsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = HikersViewHolder(
        RowHikersWordsBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: HikersViewHolder, position: Int) {
        holder.binding.apply {
            listHikers[position].apply {
                hikerName.text = name
                hikerWords.text = words
                Glide.with(holder.itemView.context).load(photo).into(hikerPhoto)
                holder.itemView.setOnClickListener {

                }
            }
        }
    }

    override fun getItemCount() = listHikers.size
}