package com.example.myapplication.data.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.myapplication.data.db.entities.loginDetails

@Dao
interface LoginDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(user: loginDetails)

//    @Delete
//    fun delete(user: loginDetails)

    @Query("SELECT * FROM login_details")
    fun getAllloginDetails(): LiveData<List<loginDetails>>
}