package com.diasandfahri.mountainapp.data

import com.diasandfahri.mountainapp.R

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

    private val mountainLocations = arrayOf(
        R.string.loc_mountain_1,
        R.string.loc_mountain_2,
        R.string.loc_mountain_3,
        R.string.loc_mountain_4,
        R.string.loc_mountain_5,
        R.string.loc_mountain_6,
        R.string.loc_mountain_7,
        R.string.loc_mountain_8,
        R.string.loc_mountain_9,
        R.string.loc_mountain_10,
    )

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

    private val mountainDescriptions = arrayOf(
        R.string.desc_mountain_1,
        R.string.desc_mountain_2,
        R.string.desc_mountain_3,
        R.string.desc_mountain_4,
        R.string.desc_mountain_5,
        R.string.desc_mountain_6,
        R.string.desc_mountain_7,
        R.string.desc_mountain_8,
        R.string.desc_mountain_9,
        R.string.desc_mountain_10
    )

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
                    descriptionStringRes = mountainDescriptions[i],
                    locationStringRes = mountainLocations[i],
                    people = listPeople[i],
                    nearest = listNearest[i],
                    recommended = listRecommended[i],
                    popular = listPopular[i]
                )
            }
            )
        }
}

