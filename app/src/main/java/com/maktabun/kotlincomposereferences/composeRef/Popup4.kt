package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Popup



@Composable
fun Popup4() {
    val isPopupOpen = remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { isPopupOpen.value = true }) {
            Text(text = "Open Popup")
        }

        Popup(
            //visible = isPopupOpen.value,
            //autoDismiss = false, // Disable dismiss when clicking outside
            onDismissRequest = { isPopupOpen.value = false }
        ) {
            Text(text = "Popup Content")
        }
    }
}