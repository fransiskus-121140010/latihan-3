package com.example.latihan3

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.latihan3.databinding.ActivityMainBinding
import com.example.latihan3.ui.theme.Latihan3Theme

class MainActivity : ComponentActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mengakses elemen UI melalui variabel binding
        binding.textView.text = "Hello, View Binding!"
        binding.button.setOnClickListener {
            Log.d("MainActivity", "Button clicked")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Latihan3Theme {
        Greeting("Android")
    }
}