package com.example.myapplication

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET


interface  Api{

    @GET("/WebApi/index.php/welcome/do_upload/")
    fun getsuperHeroes(): Call<List<myModel>>

//    @GET("/WebApi/index.php/welcome/do_upload/")
//    suspend fun getsuperHeroes(): Response<List<myModel>>
}