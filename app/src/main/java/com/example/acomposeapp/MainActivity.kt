package com.example.acomposeapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.acomposeapp.ui.theme.AComposeAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AComposeAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) {
                    Counter()
                }
            }
        }
    }
}

@Composable
fun Counter() {
    var counter by rememberSaveable { mutableIntStateOf(0) }
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Button (
            onClick = {counter += 1}
        ){

            Text("Increase")
        }

        Text(
            counter.toString(),
            fontSize = 64.sp
            )

        Button (
            onClick = {counter -= 1}
        ){
            Text("Decrease")
        }

    }

}
/*
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var myName by rememberSaveable { mutableStateOf("") }
    var colors = listOf("Blue", "Red", "Orange", "Purple", "White")

    Column (
        modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        Text(
            text = "Hello! ",
            modifier = modifier,
            fontSize = 22.sp
        )
        OutlinedTextField(
            value = myName,
            onValueChange = {
                myName = it
            },
            label={Text("Enter your name")}
        )

        for (color in colors) {
            Text(color)
            Button (
                onClick ={}
            ) {
                Text(color)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AComposeAppTheme {
        Greeting("iOS")
    }
}

 */