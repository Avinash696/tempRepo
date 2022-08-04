package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    val  TAG = "rawat"
    var apiInterface: Api? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        apiInterface = RetrofitClient.getClient()!!.create(Api::class.java)

        showImg()
    }

    private fun showImg(){
        val call: Call<List<myModel>> = apiInterface!!.getsuperHeroes()
        call.enqueue(object  :Callback<List<myModel>>{
            override fun onResponse(call: Call<List<myModel>>, response: Response<List<myModel>>) {
                Log.d(TAG, "onResponse: "+ response.body())

            }

            override fun onFailure(call: Call<List<myModel>>, t: Throwable) {
                Log.d(TAG, "onFailure: "+t.message )
            }
        })
    }
    fun uploadImg(){

    }
}