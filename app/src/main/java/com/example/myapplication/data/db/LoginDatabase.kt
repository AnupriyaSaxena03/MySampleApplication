package com.example.myapplication.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.myapplication.data.db.entities.loginDetails

@Database(
    entities = [loginDetails::class],
    version = 1
    )
abstract class LoginDatabase: RoomDatabase() {
    abstract fun getLoginDao(): LoginDao

    companion object {
        @Volatile
        private var instance : LoginDatabase?= null
        private var Lock = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(Lock) {
            instance ?: createDatabase(context).also { instance = it }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext,
            LoginDatabase::class.java, "LoginDB.db").build()

    }
}