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

@Composable
fun AppNavigation1() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "first_screen") {
        composable(route = "first_screen") {
            Nav1FirstScreen(navController = navController)
        }
        composable(route = "second_screen") {
            Nav1SecondScreen(navController = navController)
        }
    }
}

@Composable
fun Nav1FirstScreen(navController: NavController) {
    // UI code for the first screen

    Button(onClick = { navController.navigate("second_screen") }) {
        Text("Go to Second Screen")
    }
}

@Composable
fun Nav1SecondScreen(navController: NavController) {
    // UI code for the second screen

    Button(onClick = { navController.popBackStack() }) {
        Text("Go Back")
    }
}


@Preview(showBackground = true, widthDp = 300, heightDp = 500)
@Composable
private fun PreviewFunction() {
    Column() {
        AppNavigation1()
    }

}