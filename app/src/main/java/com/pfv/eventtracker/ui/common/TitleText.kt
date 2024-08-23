package com.pfv.eventtracker.ui.common

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

@Composable
fun TitleText(
    modifier: Modifier,
    text: String,
    color: Color
) {

    Text(
        modifier = modifier,
        text = text,
        style = MaterialTheme.typography.titleLarge
            .copy(
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp
            ),
        color = color,
        textAlign = TextAlign.Center
    )
}