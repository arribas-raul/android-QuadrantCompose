package com.arribas.cuadrantecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.arribas.cuadrantecompose.ui.theme.CuadranteComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    createQuadrants()
                }
            }
        }
    }
}

@Composable
fun createQuadrant(color: Color, title: String, body: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            fontSize = 22.sp,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )

        Text(
            text = body,
            textAlign = TextAlign.Justify,
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp, start = 16.dp, end = 16.dp)
        )
    }
}

@Composable
fun createQuadrants() {

    Column(Modifier.fillMaxWidth()) {

        Row(Modifier.weight(1f)) {
            createQuadrant(
                color = Color.Green,
                title = "Text composable",
                body = "Displays text and follows Material Design guidelines.",
                modifier = Modifier.weight(1f)
            )

            createQuadrant(
                color = Color.Yellow,
                title = "Image composable",
                body = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.weight(1f)
            )
        }

        Row(Modifier.weight(1f)) {
            createQuadrant(
                color = Color.Blue,
                title = "Row composable",
                body = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier.weight(1f)
            )

            createQuadrant(
                color = Color.Gray,
                title = "Column composable",
                body = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier.weight(1f)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteComposeTheme {
        createQuadrants()
    }
}