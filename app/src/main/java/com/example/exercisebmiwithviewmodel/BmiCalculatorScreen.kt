package com.example.exercisebmiwithviewmodel


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun BmiCalculatorScreen(bmiViewModel: BmiViewModel = viewModel()) {
    // A simple vertical layout with padding
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Bmi calculator",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.fillMaxWidth().padding(16.dp),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = bmiViewModel.heightInput,
            onValueChange = { bmiViewModel.heightInput = it },
            label = { Text("Height") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = bmiViewModel.weightInput,
            onValueChange = { bmiViewModel.weightInput = it },
            label = { Text("Weight") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))

        val bmiResult = bmiViewModel.bmi
        if (bmiResult != null) {
            Text(
                text = "Your bmi is %.2f".format(bmiResult),
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}