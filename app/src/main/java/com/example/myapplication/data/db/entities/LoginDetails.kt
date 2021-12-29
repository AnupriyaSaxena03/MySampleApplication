package com.example.myapplication.data.db.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "login_details")
data class loginDetails(
    @ColumnInfo(name = "user_email")
    var email: String,
    @ColumnInfo(name = "user_password")
    var password: String)
{
    @PrimaryKey(autoGenerate = true)

    var id: Int ?= null
}