package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.maktabun.kotlincomposereferences.R

@Composable
fun MyClickableImage4() {
    val imageResId = R.drawable.ball_100 // Replace with your image resource ID

    //error val composableFunction = remember { ::MyComposableFunction }
    //val composableFunctionState = rememberUpdatedState(composableFunction)

    Image(
        painter = painterResource(id = imageResId),
        contentDescription = null,
        modifier = Modifier
            .padding(16.dp)
            //.clickable { composableFunctionState.value() }
    )
}

@Composable
fun MyComposableFunction4() {
    Text("Composable function called!")
}

@Composable
fun MyScreen4() {
    MyClickableImage4()
}
