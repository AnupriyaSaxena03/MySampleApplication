package com.example.myapplication.ui.userList

import androidx.lifecycle.ViewModel
import com.example.myapplication.data.db.entities.loginDetails
import com.example.myapplication.data.repositories.LoginRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoginViewModel(private var repository: LoginRepository):ViewModel() {

    fun upsert(user: loginDetails) = CoroutineScope(Dispatchers.Main).launch {
        repository.upsert(user)
    }
    fun getAllloginDetails()= repository.getAllloginDetails()

}