package com.example.exercisebmiwithviewmodel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.exercisebmiwithviewmodel.ui.theme.ExerciseBmiWithViewModelTheme




class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExerciseBmiWithViewModelTheme {
                BmiCalculatorScreen()
            }
        }
    }
}



