package com.maktabun.kotlincomposereferences.kotlinLangRef

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Function1() {
    val count = remember { mutableStateOf(0) }

    Column {
        Text("Count: ${count.value}", modifier = Modifier.padding(16.dp))
        Button(onClick = { count.value++ }, modifier = Modifier.padding(16.dp)) {
            Text("Increment")
        }
    }
}
