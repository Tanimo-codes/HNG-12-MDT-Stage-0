package com.example.hng-12-mdt-stage-0

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppUI()
        }
    }
}

@Composable
fun AppUI() {
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Stage 0 HNG App!", fontSize = 24.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            val url = "https://github.com/Tanimo-codes/HNG-12-MDT-Stage-0"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(intent)
        }) {
            Text(text = "GitHub Repo")
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(onClick = {
            val url = "http://hng.tech/hire/kotlin-developers"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(intent)
        }) {
            Text(text = "HNG Elite Kotlin developers")
        }
    }
}
