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
                listName.text = App.resourses.getString(R.string.txt_name).format(name)
                listImg.setImageResource(img)
                listLocation.text = location
                holder.itemView.setOnClickListener {
                    val intent =
                        Intent(it.context, DetailActivity::class.java)
                    intent.putExtra(DetailActivity.MOUNTAINS_DATA,
                        listMountains[position])
                    it.context.startActivity(intent)
                    Toast.makeText(it.context,
                        App.resourses.getString(R.string.txt_welcome).format(listName.text),
                        Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    override fun getItemCount() = listMountains.size
}