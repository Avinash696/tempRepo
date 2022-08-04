package com.example.myapplication

import android.util.Log
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import com.google.gson.GsonBuilder

import com.google.gson.Gson


object RetrofitClient {
    var BASE_URL = "http://192.168.16.121/"
    private var instance: RetrofitClient? = null

    private var retrofit: Retrofit? = null

    fun getClient(): Retrofit? {
        Log.d("rawat", "getClient: ")
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY

        val gson = GsonBuilder()
            .setLenient()
            .create()


        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
        return retrofit
    }
}