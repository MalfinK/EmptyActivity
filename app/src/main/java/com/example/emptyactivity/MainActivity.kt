package com.example.emptyactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.example.emptyactivity.ui.theme.EmptyActivityTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(name = "Penerima", "Pengirim")
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.nitro_wallpaper_01_3840x2400)
   Box(
       contentAlignment = Alignment.Center
   ) {
       Surface {
           Image(
               painter = image,
               contentDescription = "Gambar",
               alignment = Alignment.Center,
               contentScale = ContentScale.Crop,
               alpha = 0.5F   
           )
       }
       Column {
           Text(
               text = "Hello $name!",
               fontSize = 20.sp,
               modifier = modifier.padding(8.dp),
               color = Color.Cyan // improve sendiri
           )
           Text(
               text = "From $from",
               textAlign = TextAlign.Right,
               color = Color.Cyan // improve sendiri
           )
       }
   }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EmptyActivityTheme {
        Greeting("Windows", "Sender")
    }
}