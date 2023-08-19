package com.rushi.photofinder.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rushi.photofinder.model.UnsplashImage
import com.rushi.photofinder.model.UnsplashRemoteKeys

@Database(
    entities = arrayOf(UnsplashImage::class, UnsplashRemoteKeys::class),
    version = 1,
    exportSchema = false
)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun getUnsplashDao() : UnsplashImageDao

    abstract fun getUnsplashRemoteKeysDao() : UnsplashRemoteKeysDao
}