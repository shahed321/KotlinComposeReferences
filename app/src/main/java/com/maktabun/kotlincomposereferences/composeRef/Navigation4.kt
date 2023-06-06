package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationExample() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "screen_one") {
        composable("screen_one") { ScreenOne(navController = navController) }
        composable("screen_two") { ScreenTwo(navController = navController) }
        composable("screen_three") { ScreenThree(navController = navController) }
        // Nested screens
        navigation(startDestination = "nested_screen_one", route = "nested_screen") {
            composable("nested_screen_one") { NestedScreenOne(navController = navController) }
            composable("nested_screen_two") { NestedScreenTwo(navController = navController) }
        }
    }
}

@Composable
fun ScreenOne(navController: NavController) {
    // Screen One content
}

@Composable
fun ScreenTwo(navController: NavController) {
    // Screen Two content
}

@Composable
fun ScreenThree(navController: NavController) {
    // Screen Three content
}

@Composable
fun NestedScreenOne(navController: NavController) {
    // Nested Screen One content
}

@Composable
fun NestedScreenTwo(navController: NavController) {
    // Nested Screen Two content
}
