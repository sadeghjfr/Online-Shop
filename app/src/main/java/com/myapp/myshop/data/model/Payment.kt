package com.myapp.myshop.data.model

import java.sql.Timestamp

data class Payment(val id:Int,
                   val products:List<Cart>,
                   val type:String,
                   val isDeliver:Boolean,
                   val userId:Int,
                   val paymentId:String,
                   val transactionId:String,
                   val transactionResult:String,
                   val status:Boolean,
                   val invoiceDetails:String,
                   val timestamp:Timestamp)
