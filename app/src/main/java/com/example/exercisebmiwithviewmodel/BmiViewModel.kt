package com.example.exercisebmiwithviewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {

    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")

    val bmi: Double?
        get() {
            val height = heightInput.toDoubleOrNull()
            val weight = weightInput.toDoubleOrNull()
            if (height != null && weight != null && height > 0) {
                return weight / (height * height)
            }
            return null
        }
}