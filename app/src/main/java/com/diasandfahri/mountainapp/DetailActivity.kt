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
            Log.d("println", "${64-(abs(verticalOffset) / appBarLayout.totalScrollRange.toDouble() * 64)}")
            val p = binding.nsvDetail.layoutParams as MarginLayoutParams
            p.setMargins(0, -((64-(abs(verticalOffset) / appBarLayout.totalScrollRange.toDouble() * 64)) * Resources.getSystem().displayMetrics.density).toInt(),0,0)
            binding.nsvDetail.layoutParams = p
            if(abs(verticalOffset) - appBarLayout.totalScrollRange == 0) {
                binding.clDetail.elevation = 0f
            }else if (verticalOffset == 0) {
                binding.clDetail.background = getDrawable(R.drawable.bg_detail)
                binding.clDetail.elevation = 4f
            }
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}