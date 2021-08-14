package com.arvind.jetsunglass.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.jetsunglass.view.DashboardScreen
import com.arvind.jetsunglass.view.OnBoardingScreen
import com.arvind.jetsunglass.view.ProductDetailsScreen
import com.arvind.jetsunglass.view.SplashScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(Screen.DashboardScreen.route) {
            DashboardScreen()
        }
        composable(Screen.OnBoardingScreen.route) {
            OnBoardingScreen()
        }

        composable(Screen.ProductDetailScreen.route) {
            ProductDetailsScreen()
        }
    }
}