package com.myapp.myshop.data.model

data class AppVersion(val currentVersion:String,
                      val isUpdateAvailable:Boolean,
                      val isForceUpdate:Boolean)
