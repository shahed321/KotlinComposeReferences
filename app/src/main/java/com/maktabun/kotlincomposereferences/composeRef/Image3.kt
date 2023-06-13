package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.maktabun.kotlincomposereferences.R

@Composable
fun MyClickableImage3() {
    val imageResId = R.drawable.ball_100 // Replace with your image resource ID

    val isClicked = remember { mutableStateOf(false) }


    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        modifier = Modifier
            .padding(16.dp)
            .clickable { isClicked.value = true }
    )

    Column() {
        if (isClicked.value) {
            MyComposableFunction3()
            //isClicked.value = false
        }
    }
}

@Composable
fun MyComposableFunction3() {
    Text("Composable function called!")
}

@Composable
fun MyScreen3() {
    MyClickableImage3()
}
