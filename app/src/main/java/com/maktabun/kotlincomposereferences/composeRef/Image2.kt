package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.maktabun.kotlincomposereferences.R

@Composable
fun MyClickableImage(onClick: () -> Unit) {
    val imageResId = R.drawable.ball_100 // Replace with your image resource ID

    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        modifier = Modifier
            .padding(16.dp)
            .clickable { onClick() }
    )
}

@Composable
fun MyComposableFunction() {
    Text("Composable function called!")
}

@Composable
fun MyScreen() {
   // MyClickableImage { MyComposableFunction() }
}

