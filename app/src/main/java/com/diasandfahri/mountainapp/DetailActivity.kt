package com.diasandfahri.mountainapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.diasandfahri.mountainapp.data.Mountain
import com.dicoding.mountainapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val MOUNTAINS_DATA = "mountains"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      untuk menampilkan toolbar
        supportActionBar?.title = "Mountains Detail"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val mountain = intent.getParcelableExtra<Mountain>(MOUNTAINS_DATA) as Mountain
        binding.apply {
            detailName.text = mountain.name
            detailLocation.text = mountain.location
            imgDetail.setImageResource(mountain.img)
            detailPeopleSuggested.text = "Suggested by ${mountain.people} people"
            detailDesc.text = mountain.description
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}