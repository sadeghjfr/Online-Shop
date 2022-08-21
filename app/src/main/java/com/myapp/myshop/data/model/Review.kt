package com.myapp.myshop.data.model

import java.sql.Timestamp

data class Review(val id:Int,
                  val reviewText:String,
                  val rating:Double,
                  val productId:Int,
                  val userNickName:String,
                  val timestamp: Timestamp)