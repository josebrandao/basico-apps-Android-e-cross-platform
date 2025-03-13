package com.example.saturno

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var editTextUsuario: EditText
    private lateinit var editTextSenha: EditText
    private lateinit var buttonEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        editTextUsuario = findViewById(R.id.usuario)
        editTextSenha = findViewById(R.id.edtsenha)
        buttonEntrar = findViewById(R.id.btnEntrar)

        buttonEntrar.setOnClickListener {
            val usuario = editTextUsuario.text.toString()
            val senha = editTextSenha.text.toString()

            if (usuario == "admin" && senha == "1234") {
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()

                // Criando Intent para ir para a tela de boas-vindas
                val intent = Intent(this, WelcomeActivity::class.java)
                startActivity(intent)

                // Finaliza a tela de login para que o usuário não possa voltar pressionando "Voltar"
                finish()
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
