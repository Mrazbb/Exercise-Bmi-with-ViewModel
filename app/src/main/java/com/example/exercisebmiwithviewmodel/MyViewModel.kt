package com.example.exercisebmiwithviewmodel



import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel


class MyViewModel: ViewModel() {
    var count by mutableStateOf(0)
    fun increment() {
        count++
    }
}