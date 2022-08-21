package com.myapp.myshop.data.model

data class User(val id:Int,
                val userName:String,
                val fullName:String,
                val nationalCode:String,
                val cardNumber:String,
                val address:Address,
                val contact: Contact,
                val Timestamp:Long,
                val cart:List<Cart>,
                val favorites:List<Int>)