package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class Screen(val route: String) {
    object FirstScreen : Screen("first_screen")
    object SecondScreen : Screen("second_screen")
    // Add more screens here
}

@Composable
fun AppNavigation2() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.FirstScreen.route) {
        composable(route = Screen.FirstScreen.route) {
            Nav2FirstScreen(navController = navController)
        }
        composable(route = Screen.SecondScreen.route) {
            Nav2SecondScreen(navController = navController)
        }
    }
}


@Composable
fun Nav2FirstScreen(navController: NavController) {
    // UI code for the first screen

    Button(onClick = { navController.navigate(Screen.SecondScreen.route) }) {
        Text("Go to Second Screen")
    }
}

@Composable
fun Nav2SecondScreen(navController: NavController) {
    // UI code for the second screen

    Button(onClick = { navController.popBackStack() }) {
        Text("Go Back")
    }
}


@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    Column() {
        AppNavigation2()
    }

}