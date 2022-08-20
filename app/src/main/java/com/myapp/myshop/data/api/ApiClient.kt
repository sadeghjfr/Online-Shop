package com.myapp.myshop.data.api

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    fun getApiClient(url: String): Retrofit? {

        val gson = GsonBuilder().setLenient().create()

        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }

   // val apiService: ApiService = getApiClient(BASE_URL)!!.create(ApiService::class.java)
}