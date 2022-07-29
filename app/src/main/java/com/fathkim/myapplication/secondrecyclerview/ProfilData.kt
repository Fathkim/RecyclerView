package com.fathkim.myapplication.secondrecyclerview

import com.fathkim.myapplication.R

object ProfilData {
    private val descProfil = arrayOf(
        "Naufal",
        "Saiful",
        "Faiq"
    )

    private val imageProfil = arrayOf(
        "https://assets.promediateknologi.com/crop/0x0:0x0/750x500/photo/ayosemarang/images/post/articles/2019/10/12/45563/tedy_djuhar_salim_grup.jpg",
        "https://media-exp1.licdn.com/dms/image/C4E03AQGIou0-WPGlPQ/profile-displayphoto-shrink_200_200/0/1538560247001?e=1660176000&v=beta&t=rbXhxZpuZPZ_NotG3R8X9wL4QD_UwSKwKoyIqikj0xY",
        "https://www.footballdatabase.eu/images/photos/players/2016-2017/a_289/289247.jpg"
    )

    val listProfil: ArrayList<Profil>
    get() {
        val list = arrayListOf<Profil>()
        for (position in descProfil.indices) {
            val desc = Profil(
                desc = descProfil[position],
                image = imageProfil[position]
            )
            list.add(desc)
        }
        return list
    }
}