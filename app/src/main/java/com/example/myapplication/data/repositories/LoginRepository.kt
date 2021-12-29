package com.example.myapplication.data.repositories

import com.example.myapplication.data.db.LoginDatabase
import com.example.myapplication.data.db.entities.loginDetails

class LoginRepository (private var db: LoginDatabase){

    suspend fun upsert(user: loginDetails) = db.getLoginDao().upsert(user)

    fun getAllloginDetails() = db.getLoginDao().getAllloginDetails()
}