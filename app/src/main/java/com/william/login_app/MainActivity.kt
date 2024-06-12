package com.william.login_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val emailEditText = findViewById<EditText>(R.id.insertEmail)
        val passwordEditText = findViewById<EditText>(R.id.insertPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)


        btnLogin.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            auth(email, password)
        }

    }

    fun auth(email: String, password: String) {

        if (email.isEmpty() && password.isEmpty())
            Toast.makeText(this, "Por favor, preencha todos os campos", Toast.LENGTH_SHORT).show()
        else if(email.isEmpty())
            Toast.makeText(this, "Email não preenchido", Toast.LENGTH_SHORT).show()
        else if(password.isNullOrEmpty())
            Toast.makeText(this, "Senha não preenchida", Toast.LENGTH_SHORT).show()
        else if(email != "admin" || password != "admin@fatec")
            Toast.makeText(this, "Usuário ou senha incorretos!", Toast.LENGTH_SHORT).show()
        else{
            val intent = Intent (this, HomePageActivity::class.java)
            startActivity(intent)
        }

    }

}