package dev.gressier.kittens.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.gressier.composesandbox.ui.theme.KittensTheme
import dev.gressier.kittens.Greeting

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KittensTheme {
                Box(Modifier.fillMaxSize(), Alignment.Center) {
                    Text(Greeting().greeting())
                }
            }
        }
    }
}