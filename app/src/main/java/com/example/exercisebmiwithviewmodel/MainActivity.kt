package com.example.exercisebmiwithviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.exercisebmiwithviewmodel.ui.theme.ExerciseBmiWithViewModelTheme
import androidx.lifecycle.viewmodel.compose.viewModel



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




@Composable
fun MyComponent(myViewModel: MyViewModel = viewModel()) {
    Button(
        onClick = {
            myViewModel.increment()
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text="Count ${myViewModel.count}")
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ExerciseBmiWithViewModelTheme {

    }
}