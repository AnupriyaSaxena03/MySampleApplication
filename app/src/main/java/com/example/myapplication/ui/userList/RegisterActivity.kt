package com.example.myapplication.ui.userList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
        loginTextView.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }

    }

    fun onRegisterClick(view: android.view.View) {
        val remail = email.text.toString()
        val rpassword = password.text.toString()

        if(remail.length < 7)
        {
            email.setError("Enter Valid Email")
        }
        else if(rpassword.isEmpty())
        {
            password.setError("Please enter password!!!")
        }
        else{
        Toast.makeText(this, "Please enter Details!!!", Toast.LENGTH_LONG).show()
        }
    }

}