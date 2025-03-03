# Meu Projeto com CoordinatorLayout 🚀

Este projeto demonstra a utilização do `CoordinatorLayout` para criar uma interface dinâmica e interativa no Android.

## 📌 Tecnologias Utilizadas
- **Linguagem:** Kotlin/Java
- **Layout:** `CoordinatorLayout`, `AppBarLayout`, `CollapsingToolbarLayout`
- **Dependências:** Material Components

## 🖼 Capturas de Tela
<p align="center">
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/projetoOrion/tela1.png?raw=true" alt="Tela 1" width="200" />
  <img src="https://github.com/josebrandao/basico-apps-Android-e-cross-platform/blob/main/projetoOrion/tela3.png?raw=true" alt="Tela 2" width="200" />
</p>

## 🛠️ Configuração da Interface (XML)
O layout principal usa `CoordinatorLayout` para fornecer uma barra de ferramentas expansível.

### `activity_main.xml`
```xml
<androidx.coordinatorlayout.widget.CoordinatorLayout 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <com.google.android.material.appbar.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/ThemeOverlay.MaterialComponents.Dark.ActionBar">

        <com.google.android.material.appbar.CollapsingToolbarLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:layout_scrollFlags="scroll|exitUntilCollapsed"
            app:contentScrim="?attr/colorPrimary"
            app:expandedTitleMarginStart="48dp"
            app:expandedTitleMarginEnd="48dp">

            <ImageView
                android:layout_width="match_parent"
                android:layout_height="200dp"
                android:scaleType="centerCrop"
                android:src="@drawable/header_image"
                app:layout_collapseMode="parallax"/>

            <androidx.appcompat.widget.Toolbar
                android:id="@+id/toolbar"
                android:layout_width="match_parent"
                android:layout_height="?attr/actionBarSize"
                app:layout_collapseMode="pin"
                app:popupTheme="@style/ThemeOverlay.MaterialComponents.Light"/>

        </com.google.android.material.appbar.CollapsingToolbarLayout>
    </com.google.android.material.appbar.AppBarLayout>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:layout_behavior="@string/appbar_scrolling_view_behavior"/>

</androidx.coordinatorlayout.widget.CoordinatorLayout>

## 🖼 Recapitulando os tipos de Layouts e os respectivos casos de uso.

| **Tipo de Layout**       | **Descrição**                                                                 | **Características**                                                                 | **Uso Comum**                                                                 |
|--------------------------|-------------------------------------------------------------------------------|------------------------------------------------------------------------------------|-------------------------------------------------------------------------------|
| **LinearLayout**         | Organiza os elementos em uma única linha (horizontal ou vertical).            | - Orientação horizontal ou vertical.<br>- `android:orientation` define a direção. | Layouts simples com elementos alinhados em sequência.                         |
| **RelativeLayout**       | Posiciona os elementos em relação a outros elementos ou ao contêiner pai.    | - Flexível para posicionamento relativo.<br>- Menos performático em hierarquias complexas. | Layouts onde os elementos precisam se relacionar entre si.                    |
| **ConstraintLayout**     | Layout flexível que permite criar designs complexos com constraints.          | - Baseado em constraints (restrições).<br>- Alta performance e flexibilidade.      | Layouts complexos e responsivos, substituindo RelativeLayout em muitos casos. |
| **FrameLayout**          | Empilha os elementos uns sobre os outros.                                     | - Útil para sobreposição de views.<br>- Geralmente usado para views únicas.       | Telas com sobreposição de elementos, como pop-ups ou fragments.               |
| **TableLayout**          | Organiza os elementos em linhas e colunas, como uma tabela.                   | - Estrutura de tabela.<br>- Linhas e colunas definidas por `TableRow`.             | Layouts que precisam de organização tabular, como formulários.                |
| **GridLayout**           | Organiza os elementos em uma grade (linhas e colunas).                        | - Mais flexível que TableLayout.<br>- Permite mesclar células.                     | Layouts que precisam de organização em grade, como galerias de imagens.       |
| **CoordinatorLayout**    | Layout avançado para comportamentos complexos e interações entre views.       | - Gerencia interações entre views.<br>- Suporta animações e scrolls complexos.    | Telas com scrolls, animações e comportamentos avançados, como AppBarLayout.   |
| **RecyclerView**         | Layout para listas e grids otimizados, com reciclagem de views.               | - Altamente eficiente para grandes conjuntos de dados.<br>- Customizável.         | Listas, grids e layouts dinâmicos com muitos itens.                           |
| **ScrollView**           | Permite rolagem de conteúdo que excede o tamanho da tela.                     | - Suporta apenas um filho direto.<br>- Rolagem vertical.                          | Telas com conteúdo extenso que precisa de rolagem.                            |
| **HorizontalScrollView** | Permite rolagem horizontal de conteúdo.                                       | - Similar ao ScrollView, mas com rolagem horizontal.                              | Telas com conteúdo que precisa de rolagem horizontal.                         |
| **ViewPager**            | Permite a navegação entre telas com gestos de deslizar (swipe).               | - Navegação por fragments ou views.<br>- Suporta transições.                      | Telas de introdução, galerias ou abas deslizáveis.                            |
| **ViewPager2**           | Versão moderna e aprimorada do ViewPager.                                     | - Suporta orientação vertical e horizontal.<br>- Melhor integração com RecyclerView. | Substitui o ViewPager em cenários mais modernos.                              |
| **MotionLayout**         | Extensão do ConstraintLayout para animações e transições complexas.           | - Cria animações baseadas em constraints.<br>- Ideal para interações avançadas.   | Telas com animações complexas e transições fluidas.                           |



