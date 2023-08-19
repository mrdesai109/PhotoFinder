package com.rushi.photofinder.data.local

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rushi.photofinder.model.UnsplashImage

@Dao
interface UnsplashImageDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertImages(images: List<UnsplashImage>)

    @Query("delete from unsplash_image_table")
    suspend fun deleteAllImages()

    @Query("select * from unsplash_image_table")
    fun getAllImages(): PagingSource<Int,UnsplashImage>

}