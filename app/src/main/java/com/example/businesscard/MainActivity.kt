package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Card(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Card(name: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        NameInfo(modifier.align(alignment = Alignment.CenterHorizontally))
        Spacer(Modifier.height(20.dp))
        Contact(modifier.align(alignment = Alignment.CenterHorizontally))
    }
}

@Composable
fun NameInfo(modifier: Modifier) {
    Column() {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = modifier
                .height(120.dp)
                .background(
                    color = Color.Black
                )
        )
        Text(
            text = "Mr. Armstrong",
            fontSize = 20.sp,
            modifier = modifier
        )
        Text(
            text = "Computer Science Program Lead",
            modifier = modifier
        )
    }
}

@Composable
fun Contact(modifier: Modifier) {
    Column() {
        Text(
            text = "+00 (00) 000 0000",
            modifier = modifier
        )
        Text(
            text = "@socialmediahandle",
            modifier = modifier
        )
        Text(
            text = "email@domain.com",
            modifier = modifier

        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        Card("Android")
    }
}