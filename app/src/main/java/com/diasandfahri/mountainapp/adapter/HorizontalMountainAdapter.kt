package com.diasandfahri.mountainapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.diasandfahri.mountainapp.DetailActivity
import com.diasandfahri.mountainapp.data.Mountain
import com.dicoding.mountainapp.databinding.RowItemMountainBinding

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
                nameRowMountain.text = name
                locationRowMountain.text = location
                imgRowMountain.setImageResource((img))
                holder.itemView.setOnClickListener {
                    val intent =
                        Intent(it.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.MOUNTAINS_DATA,
                        listMountains[position])
                    it.context.startActivity(intent)
                }
            }
        }
    }

    override fun getItemCount() = listMountains.size
}