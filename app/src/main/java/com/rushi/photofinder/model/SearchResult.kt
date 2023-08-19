package com.rushi.photofinder.model

import com.google.gson.annotations.SerializedName

data class SearchResult(
    @SerializedName("results")
    val images: List<UnsplashImage>
)
