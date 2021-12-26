package com.example.mysubmissionapp

import com.example.koreanactor.R

object ActorsData {
    private val actorName = arrayOf(
        "Hyun Bin",
        "Ji Chang-Wook",
        "Kim Soo-Hyun",
        "Lee Dong-Wook",
        "Lee Jong-Suk",
        "Lee Min-Ho",
        "Lee Seung-Gi",
        "Park Seo-Joon",
        "Song Joong-Ki",
        "Song Kang"
    )

    private val actorDetail = arrayOf(
        "Hyun Bin (real name: Kim Tae-Pyung) first gained wide recognition for his role in the 2005 romantic comedy television drama My Name is Kim Sam-soon. Since then, he has appeared in leading roles in other successful television shows including; the romantic fantasy drama Secret Garden, fantasy drama Memories of the Alhambra, and romantic drama Crash Landing on You. ",
        "Ji Chang-wook is a South Korean actor and singer. He rose to fame for playing the lead role of Dong-hae in daily drama series Smile Again, and had notable lead roles in television series such as Empress Ki, Healer, The K2, Suspicious Partner, and Lovestruck in the City.",
        "Kim Soo-hyun is one of the highest-paid actors in South Korea. His accolades include four Baeksang Arts Awards, two Grand Bell Awards and one Blue Dragon Film Award. He went on to established himself with starring roles in the television dramas Dream High, Moon Embracing the Sun.",
        "Lee Dong-wook is a South Korean actor, host, model and entertainer. He is best known for his leading roles in the television dramas My Girl, Guardian: The Lonely and Great God, Touch Your Heart and Tale of the Nine Tailed. he’s also known as the host of the talk show Strong Heart, boy group survival reality show Produce X 101, and his own American-style talk show Wook Talk.",
        "Lee Jong-Suk is a South Korean actor and model. He debuted in 2005 as a runway model, becoming the youngest male model ever to participate in Seoul Fashion Week. His breakout role was in School 2013. He is also well known for his roles in I Can Hear Your Voice, Doctor Stranger, Pinocchio, W, While You Were Sleeping, The Hymn of Death and Romance Is a Bonus Book.",
        "Lee Min-Ho is a South Korean actor, singer, model, creative director and businessman. He gained widespread fame worldwide with his role as Gu Jun-pyo in Boys Over Flowers which also earned him the Best New Actor award at the 45th Baeksang Arts Awards. This was followed by his first China-produced film Bounty Hunters",
        "Lee Seung-Gi is a South Korean singer, actor, host, and entertainer. He has numerous hit songs as a singer such as Because You're My Woman and Will You Marry Me. He has garnered further recognition as an actor and rose to popularity in parts of Asia with leading roles in popular dramas such as Brilliant Legacy, My Girlfriend Is a Gumiho. He was a member of the first season of variety show 1 Night 2 Days",
        "Park Seo-Joon is a South Korean actor and host. He made his entertainment debut in 2011 by appearing in the music video of Bang Yong-guk's single I Remember. He then appeared in television dramas Dream High 2. In 2015, he was the host of Music Bank. His breakout roles came in 2015 with the dramas Kill Me, Heal Me and She Was Pretty.",
        "Song Joong-ki is a South Korean actor. He rose to fame in the historical coming-of-age drama Sungkyunkwan Scandal and the variety show Running Man as one of the original cast members. Since then, he has played a diverse spectrum of roles in the television series The Innocent Man, Descendants of the Sun, Arthdal Chronicles and Vincenzo.",
        "Song Kang is a South Korean actor. His notable lead roles in television series include Love Alarm, Sweet Home and Nevertheless. he  made his acting debut with a supporting role in a romantic comedy television series The Liar and His Lover. He hosted the SBS's music program broadcast Inkigayo from February to October 2018."
    )

    private val actorImages = arrayOf(
        R.drawable.hyunbin,
        R.drawable.jichangwook,
        R.drawable.kimsoohyun,
        R.drawable.leedongwook,
        R.drawable.leejongsuk,
        R.drawable.leeminho,
        R.drawable.leeseunggi,
        R.drawable.parkseojoon,
        R.drawable.songjoongki,
        R.drawable.songkang
    )

    private val actorBorn = arrayOf(
        "25 September 1982",
        "5 July 1987",
        "16 February 1988",
        "6 November 1981",
        "14 September 1989",
        "22 June 1987",
        "13 January 1987",
        "16 December 1988",
        "19 September 1985",
        "23 April 1994"
    )

    private val recentWork = arrayOf(
        "Crash Landing on You (2019-2020",
        "Lovestruck in the City (2020-2021",
        "It's Okay to Not Be Okay (2020)",
        "Tale of The Nine Tailed (2020)",
        "Romance Is a Bonus Book (2019)",
        "The King: Eternal Monarch (2020)",
        "Mouse (2021)",
        "Itaewon Class (2020)",
        "Vincenzo (2021)",
        "Nevertheless (2021)"
    )

    val listData: ArrayList<Actors>
        get() {
            val list = arrayListOf<Actors>()
            for (position in actorName.indices) {
                val actor = Actors()
                actor.name = actorName[position]
                actor.detail = actorDetail[position]
                actor.photo = actorImages[position]
                actor.born = actorBorn[position]
                actor.drama = recentWork[position]
                list.add(actor)
            }
            return list
        }
}