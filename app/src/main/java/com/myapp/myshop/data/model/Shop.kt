package com.myapp.myshop.data.model

data class Shop(val id:Int,
                val title:String,
                val owner:String,
                val logo:String,
                val description:String,
                val banners: List<Banner>,
                val address:Address,
                val contact: Contact,
                val isOpen:Boolean)

// To introduce shop, or ads in shop.
data class Banner(val id:Int,
                  val imageUrl:String,
                  val isLink:Boolean,
                  val link:String,
                  val productId:Int)