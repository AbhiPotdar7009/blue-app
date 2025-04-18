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
│   ├── activity      # Activities (UI Screens)
│   ├── adapter       # RecyclerView Adapters
│   └── viewmodel     # ViewModels (State management)
│
└── MainApplication.kt  # Hilt Application class

# Architecture
MVVM (Model - View - ViewModel) + Clean Architecture

# Programming Language
Kotlin

# UI Framework
XML Layouts + ViewBinding

# Dependency Injection
Hilt (Dagger 2)

# State Management
ViewModel + LiveData

# Build System
Gradle

# Build & Tools Configuration
Minimum SDK: 24  
Target SDK: 34  
Kotlin Version: 1.9.0  
Hilt Version: 2.50  
Android Gradle Plugin: 8.2.0

# Key Dependencies
// Core Libraries
implementation("androidx.core:core-ktx:1.13.1")  
implementation("androidx.appcompat:appcompat:1.7.0")  
implementation("com.google.android.material:material:1.12.0")  
implementation("androidx.constraintlayout:constraintlayout:2.2.1")

// ViewModel and LiveData
implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")  
implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.7.0")
implementation("androidx.activity:activity-ktx:1.8.0")

// Hilt
implementation("com.google.dagger:hilt-android:2.50")  
kapt("com.google.dagger:hilt-android-compiler:2.50")

