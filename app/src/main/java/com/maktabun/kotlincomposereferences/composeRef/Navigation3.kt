package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.sourceInformationMarkerStart
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "destinationA") {
        composable(route = "destinationA") {
            DestinationA(navController = navController)
        }
        composable(route = "destinationB") {
            DestinationB(navController = navController)
        }
        composable(route = "destinationC") {
            DestinationC(navController = navController)
        }
    }

}

@Composable
fun DestinationA(navController : NavController){
    Column(){
        Text(text="A")
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {navController.navigate("destinationB")}){
            Text(text="Next")
        }
    }
}

@Composable
fun DestinationB(navController : NavController){
    Column(){
        Text(text="B")
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {navController.navigate("destinationC")}){
            Text(text="Next")
        }
    }
}


@Composable
fun DestinationC(navController : NavController){
    Column(){
        Text(text="C")
        Spacer(modifier = Modifier.padding(10.dp))
        Button(onClick = {navController.navigate("destinationA")}){
            Text(text="Back")
        }
    }
}


