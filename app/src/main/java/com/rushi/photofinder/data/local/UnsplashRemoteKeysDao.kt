package com.rushi.photofinder.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rushi.photofinder.model.UnsplashRemoteKeys


@Dao
interface UnsplashRemoteKeysDao {

    @Query("select * from unsplash_remote_keys_table where id = :id")
    suspend fun getRemoteKeys(id: String): UnsplashRemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(remoteKeys: List<UnsplashRemoteKeys>)

    @Query("delete from unsplash_remote_keys_table")
    suspend fun deleteAllRemoteKeys()
}