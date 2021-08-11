package com.arvind.jetsunglass.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("splash_screen")
    object DashboardScreen : Screen("dashboard_screen")
    object OnBoardingScreen : Screen("onboarding_screen")
    object ProductDetailScreen : Screen("product_detail_screen")

}
