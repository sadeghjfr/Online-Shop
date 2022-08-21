package com.myapp.myshop.data.model

data class Address(val state:String,
                   val city:String,
                   val street:String,
                   val latitude:Long,
                   val longitude:Long,
                   val postalCode:String)