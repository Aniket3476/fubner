package com.example.fubner.utils

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class NewActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UiBox()
        }
    }

}

@Composable
fun UiBox(modifier: Modifier = Modifier){
    Column(modifier = modifier,
    verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Hello World!!", fontSize = 40.sp)
        Spacer(modifier = Modifier.size(50.dp))
        Text(text = "Bna Diya !!", fontSize = 90.sp)


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUi(){
    Surface(color = Color.Yellow){
        UiBox(modifier = Modifier.fillMaxSize())
    }
}