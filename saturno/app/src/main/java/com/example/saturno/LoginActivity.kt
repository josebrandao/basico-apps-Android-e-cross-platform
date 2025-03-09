package com.example.saturno

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    // Declaração dos componentes da interface
    private lateinit var editTextUsuario: EditText
    private lateinit var editTextSenha: EditText
    private lateinit var buttonEntrar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout da atividade
        setContentView(R.layout.activity_login) // Substitua "activity_login" pelo nome do seu arquivo XML

        // Inicializa os componentes da interface
        editTextUsuario = findViewById(R.id.usuario)
        editTextSenha = findViewById(R.id.edtsenha)
        buttonEntrar = findViewById(R.id.btnEntrar)

        // Configura o listener do botão de login
        buttonEntrar.setOnClickListener {
            val usuario = editTextUsuario.text.toString()
            val senha = editTextSenha.text.toString()

            // Verifica se o usuário e a senha estão corretos
            if (usuario == "admin" && senha == "1234") {
                // Login bem-sucedido
                Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_SHORT).show()
            } else {
                // Login falhou
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}