package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import com.maktabun.kotlincomposereferences.R

@Composable
fun AlertDialog1() {
    // Create a mutable state to track the visibility of the dialog
    val showDialog = remember { mutableStateOf(false) }

    // Show the AlertDialog when showDialog value is true
    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = {
                // Dismiss the dialog when the user clicks outside the dialog or presses the back button
                showDialog.value = false
            },
            title = {
                Text(text = stringResource(R.string.alert_dialog_title))
            },
            text = {
                Text(text = stringResource(R.string.alert_dialog_message))
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        // Handle the confirm button click
                        showDialog.value = false
                    }
                ) {
                    Text(text = stringResource(R.string.confirm_button_text))
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        // Handle the dismiss button click
                        showDialog.value = false
                    }
                ) {
                    Text(text = stringResource(R.string.dismiss_button_text))
                }
            }
        )
    }

    // Button to show the dialog
    Button(
        onClick = {
            // Set the showDialog value to true to show the dialog
            showDialog.value = true
        }
    ) {
        Text(text = "Show Alert1")
    }
}
