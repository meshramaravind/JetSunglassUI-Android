package com.arvind.jetsunglass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.arvind.jetsunglass.navigation.Navigation
import com.arvind.jetsunglass.ui.theme.JetSunglassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetSunglassAppUiMain()
        }
    }

    @Composable
    fun JetSunglassAppUiMain() {
        JetSunglassTheme {
            Surface(color = MaterialTheme.colors.background) {
                Navigation()
            }

        }
    }

}

