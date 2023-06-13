package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.*
import androidx.compose.ui.window.Popup

@Composable
fun Popup3(){
    var popup by remember { mutableStateOf(false) }
    TextButton(onClick = { popup = true }) {
        Text("Open window popup")
    }

    if (popup) {
        Popup(
            popupPositionProvider = WindowCenterOffsetPositionProvider(),
            onDismissRequest = { popup = false },
        ) {
            Text("Popup")
        }
    }
}