package com.example.retrofit2_sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.retrofit2_sample.common.RetrofitClient
import com.example.retrofit2_sample.common.RetrofitService
import com.example.retrofit2_sample.data.Food
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {
    private val TAG = this::class.java.simpleName
    private lateinit var retrofit: Retrofit
    private lateinit var retrofitService: RetrofitService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRetrofit()
        retrofitService.getFoodInfoByName("훈제오리").enqueue(object : retrofit2.Callback<Food> {
            override fun onResponse(call: Call<Food>, response: Response<Food>) {
                Log.d(TAG, response.body().toString())
            }

            override fun onFailure(call: Call<Food>, t: Throwable) {
                Log.d(TAG, "실패 : {$t}")
            }
        })
    }

    private fun initRetrofit() {
        retrofit = RetrofitClient.getInstance()
        retrofitService = retrofit.create(RetrofitService::class.java)
    }
}
