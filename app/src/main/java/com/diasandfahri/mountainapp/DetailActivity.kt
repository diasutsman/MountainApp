package com.diasandfahri.mountainapp

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.marginTop
import com.diasandfahri.mountainapp.data.Mountain
import com.dicoding.mountainapp.databinding.ActivityDetailBinding
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs
import android.view.ViewGroup
import android.view.ViewGroup.MarginLayoutParams
import android.widget.Toast
import com.dicoding.mountainapp.R


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val MOUNTAINS_DATA = "mountains"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      untuk menampilkan toolbar dan tombol back
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val mountain = intent.getParcelableExtra<Mountain>(MOUNTAINS_DATA) as Mountain
        binding.apply {
            detailName.text = mountain.name
            detailLocation.text = mountain.location
            imgDetail.setImageResource(mountain.img)
            detailPeopleSuggested.text = "Suggested by ${mountain.people} people"
            detailDesc.text = mountain.description
        }
        binding.appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            Log.d("println", "${(appBarLayout.totalScrollRange + verticalOffset) / appBarLayout.totalScrollRange}")
            val value = (appBarLayout.totalScrollRange + verticalOffset) / appBarLayout.totalScrollRange.toDouble()
            var p = binding.nsvDetail.layoutParams as MarginLayoutParams
            p.setMargins(0, -(value * 64 * Resources.getSystem().displayMetrics.density).toInt(),0,0)
            binding.nsvDetail.layoutParams = p
            binding.cvDetail.cardElevation = 4f * Resources.getSystem().displayMetrics.density
            binding.cvDetail.radius = (value * 64 * Resources.getSystem().displayMetrics.density).toFloat()

            p = binding.detailName.layoutParams as MarginLayoutParams
            p.setMargins((value * 32 * Resources.getSystem().displayMetrics.density).toInt(),0,0,0)
            binding.detailName.layoutParams = p

//          if appbar collapse
            if(abs(verticalOffset) - appBarLayout.totalScrollRange == 0) {
                binding.cvDetail.cardElevation = 0f
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}