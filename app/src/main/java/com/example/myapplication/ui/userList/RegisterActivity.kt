package com.example.myapplication.ui.userList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R
import com.example.myapplication.data.db.LoginDatabase
import com.example.myapplication.data.repositories.LoginRepository

class RegisterActivity : AppCompatActivity() {

    lateinit var email : EditText
    lateinit var password: EditText
    lateinit var registerButton: Button
    lateinit var loginTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val database = LoginDatabase(this)
        val repository = LoginRepository(database)
        val factory = LoginViewModelFactory(repository)

        val viewModel = ViewModelProviders.of(this, factory).get(LoginViewModel::class.java)

        email = findViewById(R.id.emailET)
        password = findViewById(R.id.passwordET)
        registerButton = findViewById(R.id.registerB)
        loginTextView = findViewById(R.id.loginT)

       // viewModel.upsert()

    }
}