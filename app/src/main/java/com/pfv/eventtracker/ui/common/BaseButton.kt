package com.pfv.eventtracker.ui.common

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BaseButton(
    modifier: Modifier,
    text: String,
    onClick: () -> Unit
){

    Button(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = 8.dp),
            text = text,
            color = MaterialTheme.colorScheme.background,
            fontSize = 16.sp,
        )
    }
}