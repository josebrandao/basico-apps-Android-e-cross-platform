# 🚀 Projetos Android

Este repositório contém projetos básicos de Android, explorando diferentes layouts, recursos e funcionalidades. Cada projeto foi desenvolvido para demonstrar conceitos específicos e resolver problemas comuns durante o desenvolvimento.

---

## 📂 Estrutura do Repositório

- **gama01/**: Projeto exemplo de `LinearLayout` com ajustes de sincronização no Gradle e JDK.
- **orion/**: Projeto exemplo de `Compose` utilizando `ConstraintLayout` e transições de telas.

---

# 📱 Projeto Gama01

O projeto **Gama01** é um exemplo simples de `LinearLayout` que aborda os seguintes tópicos:
<div align="center">
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/image01.png" alt="Descrição da Imagem 1" width="200"/>
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/image02.png" alt="Descrição da Imagem 2" width="200"/>
</div>
### 🛠️ Problemas Resolvidos
- **Sincronização no Gradle**: Ajustes para compatibilidade entre versões do Gradle e JDK.
- **Uso de Ícones e Imagens**: Exploração de recursos básicos, como adicionar ícones e imagens nas pastas `mipmap` e `drawable`.
- **Substituição do `MainActivity`**: A `MainActivity` original utilizava `Compose`, mas foi substituída pelo modelo usual de layout XML.

### 🧩 Estrutura do Projeto
- **Layout (`login_activity.xml`)**: Um `LinearLayout` com orientação vertical, contendo um `Button` e vários `TextView`.
- **Atividade (`LoginActivity.kt`)**: Carrega o layout `login_activity.xml`.
- **Tema (`styles.xml`)**: Utiliza `Theme.MaterialComponents` para estilização.

### 🚀 Como Executar
1. Navegue até a pasta do projeto:
   ```bash
   cd gama01

   Abra o projeto no Android Studio.

Execute o aplicativo em um emulador ou dispositivo físico.

# 🌌 Projeto Orion
O projeto Orion é um exemplo de Compose que demonstra:

<div align="center">
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/tela1.png" alt="Descrição da Imagem 1" width="200"/>
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/tela3.png" alt="Descrição da Imagem 2" width="200"/>
</div>

🛠️ Funcionalidades
ConstraintLayout: Uso de ConstraintLayout para organizar elementos na tela.

Transições de Telas: Um botão simples que faz transições entre telas.

🧩 Estrutura do Projeto
Compose: Utiliza a biblioteca Jetpack Compose para criar interfaces de usuário modernas.

Navegação: Implementa transições entre telas com Compose Navigation.

🚀 Como Executar
Navegue até a pasta do projeto:

bash
Copy
cd orion
Abra o projeto no Android Studio.

Execute o aplicativo em um emulador ou dispositivo físico.

🛠️ Tecnologias Utilizadas
Android Studio: IDE oficial para desenvolvimento Android.

Kotlin: Linguagem de programação utilizada.

Gradle: Ferramenta de automação de builds.

Jetpack Compose: Biblioteca moderna para criação de interfaces de usuário.

Material Components: Componentes de UI seguindo as diretrizes do Material Design.

🚀 Como Usar
Clone o repositório:

bash
Copy
git clone https://github.com/josebrandao/basico-apps-Android-e-cross-platform.git
Navegue até a pasta do projeto desejado:

bash
Copy
cd basico-apps-Android-e-cross-platform/nome_da_pasta
Abra o projeto no Android Studio.

Execute o aplicativo em um emulador ou dispositivo físico.

📝 Licença
Este projeto está licenciado sob a MIT License.

Se precisar de mais ajuda, é só perguntar! 😊

Emojis Usados:
🚀: Projetos e execução

📂: Estrutura do repositório

📱: Projeto Gama01

🌌: Projeto Orion

🛠️: Problemas resolvidos e funcionalidades

🧩: Estrutura do projeto

🚀: Como executar

🛠️: Tecnologias utilizadas

📝: Licença

# 🚀 Projeto Saturno
Bem-vindo ao Saturno! Este projeto é uma aplicação Android básica que demonstra uma tela de login com validação simples e uso de recursos visuais. 🎉
<div align="center">
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/saturno01.png" alt="Descrição da Imagem 1" width="200"/>
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/saturno03.png" alt="Descrição da Imagem 2" width="200"/>
</div>
📱 Funcionalidades
Tela de Login Simples: Uma interface de usuário limpa e intuitiva para login.

Validação Básica: Verifica se o usuário e a senha estão corretos.

Feedback com Toast: Exibe uma mensagem de sucesso ou erro ao tentar fazer login.

Layout com LinearLayout: Uso de LinearLayout para organizar os elementos na tela.

Recursos Visuais: Imagens personalizadas carregadas da pasta res/drawable.

🛠️ Tecnologias e Recursos
Kotlin: Linguagem de programação utilizada.

LinearLayout: Para organizar os componentes da interface.

ImageView: Exibe imagens carregadas da pasta res/drawable.

EditText: Campos de entrada para usuário e senha.

Button: Botão para realizar o login.

Toast: Exibe mensagens de feedback ao usuário.

🎨 Layout da Tela
A tela de login é composta pelos seguintes elementos:

Imagem de Fundo: Uma imagem representativa carregada da pasta res/drawable.

Campo de Usuário: Um EditText para inserir o nome de usuário.

Campo de Senha: Um EditText para inserir a senha (com input type textPassword).

Botão de Login: Um Button para validar as credenciais.

Feedback com Toast: Exibe "Login bem-sucedido!" ou "Usuário ou senha incorretos".

🖼️ Recursos Visuais
As imagens utilizadas no projeto estão na pasta res/drawable:

etec.png: Imagem da ETEC.

perfil5.png: Imagem de perfil do usuário.

🛠️ Como Executar o Projeto
Clone o repositório:

bash
Copy
git clone https://github.com/seu-usuario/saturno.git
Abra o projeto no Android Studio:

Inicie o Android Studio.

Selecione "Open an existing project" e navegue até a pasta do projeto.

Execute o aplicativo:

Conecte um dispositivo Android ou use um emulador.

Clique em "Run" (atalho: Shift + F10).

📂 Estrutura do Projeto
Copy
saturno/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/example/saturno/
│   │   │   │       └── LoginActivity.kt
│   │   │   ├── res/
│   │   │   │   ├── drawable/
│   │   │   │   │   ├── etec.png
│   │   │   │   │   └── perfil5.png
│   │   │   │   ├── layout/
│   │   │   │   │   └── activity_login.xml
│   │   │   │   └── values/
│   │   │   │       └── strings.xml
│   │   │   └── AndroidManifest.xml
│   └── build.gradle
└── README.md
🧑‍💻 Código Principal
activity_login.xml
xml
Copy
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="30dp">

    <ImageView
        android:id="@+id/imageViewEtec"
        android:layout_width="match_parent"
        android:layout_height="142dp"
        android:src="@drawable/etec"
        android:contentDescription="@string/etec_image_description" />

    <ImageView
        android:id="@+id/imageViewPerfil"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="20dp"
        android:src="@drawable/perfil5"
        android:contentDescription="@string/perfil_image_description" />

    <EditText
        android:id="@+id/usuario"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:hint="Entre com o usuário"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/edtsenha"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:hint="Entre com a sua senha"
        android:inputType="textPassword" />

    <Button
        android:id="@+id/btnEntrar"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="20dp"
        android:text="Entrar" />
</LinearLayout>
Run HTML
LoginActivity.kt
kotlin
Copy
package com.example.saturno

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val editTextUsuario = findViewById<EditText>(R.id.usuario)
        val editTextSenha = findViewById<EditText>(R.id.edtsenha)
        val buttonEntrar = findViewById<Button>(R.id.btnEntrar)

        buttonEntrar.setOnClickListener {
            val usuario = editTextUsuario.text.toString()
            val senha = editTextSenha.text.toString()

            if (usuario == "admin" && senha == "1234") {
                Toast.makeText(this, "Login bem-sucedido! 🎉", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Usuário ou senha incorretos ❌", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
📝 Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.











