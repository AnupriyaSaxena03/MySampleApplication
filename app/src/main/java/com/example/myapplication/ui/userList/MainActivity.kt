package com.example.myapplication.ui.userList

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R
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

    }
}