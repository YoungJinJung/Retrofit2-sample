package com.example.retrofit2_sample.common

import com.example.retrofit2_sample.data.Food
import com.example.retrofit2_sample.data.Member
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    @GET("/api/v1/foodInfo")
    fun getFoodInfoList(): List<Call<Food>>

    @GET("/api/v1/foodInfo/name/{foodName}")
    fun getFoodInfoByName(
        @Path("foodName") pathName: String
    ): Call<Food>

    @POST("/api/v1/member/createMember")
    fun createMember(
        @Body member: Member
    ): Call<Member>
}