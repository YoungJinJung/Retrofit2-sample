package com.example.retrofit2_sample.common

import com.example.retrofit2_sample.data.EatingHistory
import com.example.retrofit2_sample.data.Food
import com.example.retrofit2_sample.data.FoodCategory
import com.example.retrofit2_sample.data.Member
import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    //About Member
    @POST("/api/v1/member/createMember")
    fun createMember(
            @Body member: Member
    ): Call<Boolean>

    @GET("/api/v1/member/readMember/{memberId}")
    fun readMember(
            @Path("memberId") memberId: String
    ): Call<Member>

    @PUT("/api/v1/member/updateMember")
    fun updateMember(
            @Body member: Member
    ): Call<Boolean>

    @DELETE("/api/v1/member/deleteMember")
    fun deleteMember(
            @Body member: Member
    ): Call<Boolean>

    //About Food
    @POST("/api/v1/foodInfo")
    fun addFoodInfo(
            @Body food: Food
    ): Call<Food>

    @PUT("/api/v1/foodInfo")
    fun updateFoodInfo(
            @Body food: Food
    ): Call<Food>

    @DELETE("/api/v1/foodInfo")
    fun deleteFoodInfo(
            @Body food: Food
    ): Call<Boolean>

    @GET("/api/v1/foodInfo/name/{foodName}")
    fun getFoodInfoByName(
            @Path("foodName") pathName: String
    ): Call<Food>

    @GET("/api/v1/foodInfo/name/{foodCode}")
    fun getFoodInfoByCode(
            @Path("foodCode") pathName: String
    ): Call<Food>

    @GET("/api/v1/foodInfo")
    fun getFoodInfoList(): List<Call<Food>>

    @GET("/api/v1/foodInfo/category/{foodCategory}")
    fun getFoodInfoListByCategory(
            @Path("foodCategory") foodCategory: String
    ): List<Call<Food>>

    //About EatingHistory
    @POST("/api/v1/eatingHistory/add")
    fun addEatingHistory(
            @Body eatingHistory: EatingHistory
    ): Call<Boolean>

    @GET("/api/v1/eatingHistory/read/{userId}")
    fun getEatingHistory(
            @Path("userId") userId: String
    ): List<Call<EatingHistory>>

    @PUT("/api/v1/eatingHistory/update")
    fun updateEatingHistory(
            @Body eatingHistory: EatingHistory
    ): Call<Boolean>

    @DELETE("/api/v1/eatingHistory/delete")
    fun deleteEatingHistory(
            @Body eatingHistory: EatingHistory
    ): Call<Boolean>

}