package com.maktabun.kotlincomposereferences.composeRef

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Dropdown1() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Option 1") }
    val options = listOf("Option 1", "Option 2", "Option 3")

    Column {
        Text("Selected option: $selectedOption")

        Box(modifier = Modifier.wrapContentSize()) {
            Button(
                onClick = { expanded = !expanded },
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text(text = selectedOption)
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier
                    .widthIn(min = Dp.Unspecified, max = Dp.Infinity)
                    .padding(horizontal = 8.dp)
            ) {
                options.forEach { option ->
                    DropdownMenuItem(
                        onClick = {
                            selectedOption = option
                            expanded = false
                        }
                    ) {
                        Text(text = option)
                    }
                }
            }
        }
    }
}
