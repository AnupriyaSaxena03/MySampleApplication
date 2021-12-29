package com.example.myapplication.ui.userList

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import com.example.myapplication.R
import com.example.myapplication.data.db.LoginDatabase
import com.example.myapplication.data.repositories.LoginRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var vModel : LoginViewModel

    lateinit var emailEditText : EditText
    lateinit var passwordEditText : EditText
    lateinit var loginButton : Button
    lateinit var registerTextView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        emailEditText = findViewById(R.id.emailE)
        passwordEditText = findViewById(R.id.passwordE)
        loginButton = findViewById(R.id.loginB)
        registerTextView = findViewById(R.id.registerT)

        val database = LoginDatabase(this)
        val repository = LoginRepository(database)
        val factory = LoginViewModelFactory(repository)


        val viewModel = ViewModelProviders.of(this, factory).get(LoginViewModel::class.java)

        registerTextView.setOnClickListener {
            val i = Intent(this, RegisterActivity::class.java)
            startActivity(i)
        }

    }



    fun onButtonClick(view: android.view.View) {
        val lemail = emailEditText.text.toString()
        val lpassword = passwordEditText.text.toString()
        val i = Intent(this, RegisterActivity::class.java)
        startActivity(i)


    }

}