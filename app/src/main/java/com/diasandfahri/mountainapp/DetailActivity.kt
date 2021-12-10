package com.diasandfahri.mountainapp

import android.content.res.Resources
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup.MarginLayoutParams
import androidx.appcompat.app.AppCompatActivity
import com.diasandfahri.mountainapp.data.Mountain
import com.diasandfahri.mountainapp.databinding.ActivityDetailBinding
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs


class DetailActivity : AppCompatActivity() {

    private lateinit var mountain: Mountain
    private lateinit var binding: ActivityDetailBinding
    private val dp: Float = Resources.getSystem().displayMetrics.density

    companion object {
        const val MOUNTAINS_DATA = "mountains"
        const val TAG = "DetailActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate Called")
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
//      untuk menampilkan toolbar dan tombol back
        setSupportActionBar(binding.toolbarDetail)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        mountain = intent.getParcelableExtra<Mountain>(MOUNTAINS_DATA) as Mountain
        binding.apply {
            with(mountain) {
                detailName.text = detailName.text.toString().format(name)
                detailLocation.text = getString(locationStringRes)
                imgDetail.setImageResource(img)
                detailPeopleSuggested.text = detailPeopleSuggested.text.toString().format(people)
                detailDesc.text = getString(descriptionStringRes)
            }
        }
        binding.appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
//          Relative position (in 0..1) while scrolling
            val value = (appBarLayout.totalScrollRange + verticalOffset) / appBarLayout.totalScrollRange.toFloat()

//          Set margin between detail text and detail image
            var p = binding.nsvDetail.layoutParams as MarginLayoutParams
            p.setMargins(0, -(value * 64 * dp).toInt(), 0, 0)
            binding.nsvDetail.layoutParams = p
            binding.cvDetail.cardElevation = if (appBarLayout.totalScrollRange + verticalOffset == 0) 0f else 4f * dp
            binding.cvDetail.radius = (value * 64 * dp)

//          Set margin for TextView
            p = binding.detailName.layoutParams as MarginLayoutParams
            p.setMargins((value * 32 * dp).toInt(), 0, 0, 0)
            binding.detailName.layoutParams = p
        })
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

}