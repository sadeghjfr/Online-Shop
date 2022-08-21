package com.myapp.myshop.data.model

import android.media.Image

data class Shop(val id:Int,
                val title:String,
                val owner:String,
                val logo:String,
                val description:String,
                val banners:List<Image>,
                val introductions: List<Introduction>,
                val address:Address,
                val contact: Contact,
                val isOpen:Boolean)

// To introduce shop, when user open app first time.
data class Introduction(val id:Int,
                        val title:String,
                        val subTitle:String,
                        val url:String)