package com.diasandfahri.mountainapp.data

import com.diasandfahri.mountainapp.R

object HikersData {

    private val hikersName = arrayOf(
        "Grandma Gatewood",
        "Andrew Skurka",
        "Buddy Backpacker",
        "Heather \"Anish\" Anderson",
        "Bill Bryson",
        "George \"Billy Goat\" Woodard",
        "Jennifer Pharr Davis",
        "Earl Shaffer",
        "Cheryl Strayed",
        "Bill Irwin"
    )

    private val hikersPhoto = arrayOf(
        R.drawable.gatewood,
        R.drawable.andy_skurka,
        R.drawable.buddyb,
        R.drawable.anderson,
        R.drawable.bill_bryson_pic,
        R.drawable.goat,
        R.drawable.davis,
        R.drawable.shaffer,
        R.drawable.cstrayed,
        R.drawable.birwin
    )

    private val hikersWords = arrayOf(
        """I would never have started this trip if I had known how tough it was, but I couldn't and wouldn't quit.""",
        """I think planning to be a "professional adventurer" is about as realistic as planning to be a basketball player, so I don't usually encourage it.""",
        """I felt really proud of what I did and also what my family did. Then, the first thing I wanted to do was eat at a Chinese buffet in town.""",
        """The beautiful thing about long trails and the mountains is that they are what you need them to be, even if you don’t know what you need them to be.""",
        """Every twenty minutes on the Appalachian Trail, Katz and I walked farther than the average American walks in a week.""",
        """I'm not on vacation. I'm not out for a weekend. This is where I live. When you do that, all the other trappings of life fade away.""",
        """In my opinion, the more fast-paced and overstimulated the world becomes, the more important it will be to take a walk in the woods.""",
        """I'm mighty, mighty glad it's over. If I had another week I would fall on my face.""",
        """Fear, to a great extent, is born of a story we tell ourselves, and so I chose to tell myself a different story from the one women are told. I decided I was safe. I was strong. I was brave. Nothing could vanquish me.""",
        """The Trail was a pilgrimage to share God's love with all those whom I met while hiking."""
    )

    val listHikersData: ArrayList<Hikers>
        get() {
            val list = arrayListOf<Hikers>()
            for (i in hikersName.indices) {
                list.add(
                    Hikers(
                        name = hikersName[i],
                        words = hikersWords[i],
                        photo = hikersPhoto[i]
                    )
                )
            }
            return list
        }


}