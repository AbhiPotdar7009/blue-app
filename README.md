# Project Structure
com.example.blue_app
├── di
│   └── module        # Hilt DI modules
│
├── domain
│   ├── model         # Domain models (pure business models)
│   └── usecase       # Business logic Use Cases
│
├── ui
│   ├── activity      # Activities (Entry points)
│   ├── screen        # Composable Screens
│   └── viewmodel     # ViewModels (State management)
│
└── MainApplication.kt  # Hilt Application class

# Architecture
MVVM (Model - View - ViewModel) + Clean Architecture

# Programming Language 
Kotlin

# UI Framework
Jetpack Compose

# Dependency Injection 
Hilt (Dagger 2)

# State Management
ViewModel + LiveData

# Build System
Gradle

# Build & Tools Configuration
Minimum SDK: 24
Target SDK: 34
Compose Compiler Extension: 1.5.1
Kotlin Version: 1.9.0
Hilt Version: 2.50
Android Gradle Plugin: 8.2.0

# Key Dependencies
// Jetpack Compose
implementation("androidx.compose.ui:ui:1.5.1")
implementation("androidx.compose.material3:material3:1.2.0")
implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2")
implementation("androidx.navigation:navigation-compose:2.7.3")

// Hilt
implementation("com.google.dagger:hilt-android:2.50")
kapt("com.google.dagger:hilt-android-compiler:2.50")

// Core Libraries
implementation("androidx.core:core-ktx:1.13.1")
implementation("androidx.appcompat:appcompat:1.7.0")
implementation("com.google.android.material:material:1.12.0")
implementation("androidx.constraintlayout:constraintlayout:2.2.1")