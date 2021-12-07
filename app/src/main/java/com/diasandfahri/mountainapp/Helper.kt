package com.diasandfahri.mountainapp

import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.diasandfahri.mountainapp.data.Mountain

fun toDetail(context: Context, extra: Mountain, msg: String) {
    val intent =
        Intent(context, DetailActivity::class.java)
    intent.putExtra(DetailActivity.MOUNTAINS_DATA,
        extra)
   context.startActivity(intent)
    Toast.makeText(context,
        msg,
        Toast.LENGTH_SHORT).show()
}