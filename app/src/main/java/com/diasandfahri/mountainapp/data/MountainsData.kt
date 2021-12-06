package com.diasandfahri.mountainapp.data

import com.dicoding.mountainapp.R

object MountainsData {
    private val mountainNames = arrayOf(
        "Bromo",
        "Semeru",
        "Prau",
        "Rinjani",
        "Ijen",
        "Kelimutu",
        "Patuha",
        "Kerinci",
        "Cartensz",
        "Gede"
    )

    private val mountainLocations = App.resourses.getStringArray(R.array.list_location)

    private val mountainImages = arrayOf(
        R.drawable.bromo,
        R.drawable.semeru,
        R.drawable.prau,
        R.drawable.rinjani,
        R.drawable.ijen,
        R.drawable.kelimutu,
        R.drawable.patuha,
        R.drawable.kerinci,
        R.drawable.cartensz,
        R.drawable.gede
    )

    private val mountainDescriptions = App.resourses.getStringArray(R.array.detail_mountains)

    private val listPeople = arrayOf(
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
    )

    private val listPopular = arrayOf(
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
    )

    private val listNearest = arrayOf(
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
    )

    private val listRecommended = arrayOf(
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
        (1..100).random(),
    )

    val listMountains: ArrayList<Mountain>
        get() {
            return ArrayList(mountainNames.indices.map { i ->
                Mountain(
                    name = mountainNames[i],
                    img = mountainImages[i],
                    description = mountainDescriptions[i],
                    location = mountainLocations[i],
                    people = listPeople[i],
                    nearest = listNearest[i],
                    recommended = listRecommended[i],
                    popular = listPopular[i]
                )
            }
            )
        }
}

