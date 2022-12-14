package com.example.AMnews.api

import com.example.AMnews.Models.Post
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/v2/top-headlines")
    suspend fun getPost(
        @Query("country")country: String,
        @Query("apiKey") apiKey : String
    ): Response<Post>

}