package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.maktabun.kotlincomposereferences.R

@Composable
fun Image1() {
    Image(
        painter = painterResource(id = R.drawable.ball_100),
        contentDescription = "Dummy Image"
    )
}