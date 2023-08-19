package com.rushi.photofinder.data.remote

import com.rushi.photofinder.BuildConfig
import com.rushi.photofinder.model.SearchResult
import com.rushi.photofinder.model.UnsplashImage
import com.rushi.photofinder.utils.accessKey
import retrofit2.http.GET
import retrofit2.http.HeaderMap
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashAPI {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("photos")
    suspend fun getAllImages(@Query("page") page: Int, @Query("per_page") perPage: Int) : List<UnsplashImage>

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("search/photos")
    suspend fun searchImages(@Query("query") query: String, @Query("per_page") perPage: Int) : SearchResult
}