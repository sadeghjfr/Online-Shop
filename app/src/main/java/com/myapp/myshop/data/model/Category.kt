package com.myapp.myshop.data.model

data class Category(val id:Int,
                    val title:String,
                    val imageUrl:String,
                    val parentId:Int,
                    val categories: List<Category> )