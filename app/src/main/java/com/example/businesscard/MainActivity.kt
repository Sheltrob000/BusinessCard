package com.example.businesscard

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
            .background(color = Color.Cyan)
            .padding(20.dp)
    ) {
        Spacer(modifier.height(40.dp))
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
                .height(60.dp)
                .background(
                    color = Color.Black
                )
        )
        Text(
            text = "Robert Shelton",
            fontSize = 15.sp,
            modifier = modifier,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Aspiring coder",
            fontSize = 10.sp,
            modifier = modifier,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun Contact(modifier: Modifier) {
    Column() {
        Row {
            Icon(
                Icons.Rounded.Call,
                contentDescription = null,
                modifier = modifier.size(15.dp)
            )

            Text(
                text = "+00 (00) 000 0000",
                fontSize = 10.sp,
                modifier = modifier
            )
        }
        Row {


            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                modifier = modifier.size(15.dp)
            )

            Text(
                text = "@aspiringCoder",
                fontSize = 10.sp,
                modifier = modifier
            )
        }

        Row {

            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                modifier = modifier.size(15.dp)
            )

            Text(
                text = "email@domain.com",
                fontSize = 10.sp,
                modifier = modifier

            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        Card("Android")
    }
}