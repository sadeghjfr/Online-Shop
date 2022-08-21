package com.myapp.myshop.data.model

import java.sql.Timestamp

data class ProductModel(val offset:Int,
                        val products:List<Product>,
                        val sorts:List<Sort>,
                        val count:Int,
                        val limit:Int)

data class Product(val id:Int,
                   val title:String,
                   val images:List<String>,
                   val videos:List<String>,
                   val price:Double,
                   val offPercent:Int,
                   val ratingCount:Int,
                   val avgRating:Double,
                   val description:String,
                   val count:Int,
                   val code:Int,
                   val timestamp: Timestamp)

data class Sort(val id:Int,
                val title:String,
                val active:Boolean)
