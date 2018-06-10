package com.example.jon_snow.gamazon.Service

import com.example.jon_snow.gamazon.Models.Categories
import com.example.jon_snow.gamazon.Models.Products

object DataService {
    val categories = listOf(
            Categories("Shirts","shirtimage"),
            Categories("Hats","hatimage"),
            Categories("Hoodies","hoodieimage"),
            Categories("Digital Goods","digitalgoodsimage")
    )

    val shirts = listOf(
            Products("Shirt1","$5","shirt1"),
            Products("Shirt2","$5","shirt2"),
            Products("Shirt3","$5","shirt3"),
            Products("Shirt4","$5","shirt4"),
            Products("Shirt5","$5","shirt5")


    )
    val hoodies = listOf(
            Products("Hoodie1","$10","hoodie1"),
            Products("Hoodie2","$10","hoodie2"),
            Products("Hoodie3","$10","hoodie3"),
            Products("Hoodie4","$10","hoodie4")

    )
    val hats = listOf(

            Products("Hat1","$3","hat1"),
            Products("Hat2","$3","hat2"),
            Products("Hat3","$3","hat3"),
            Products("Hat4","$3","hat4")
    )

}