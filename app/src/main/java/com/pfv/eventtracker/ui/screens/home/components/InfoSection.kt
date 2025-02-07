package com.pfv.eventtracker.ui.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoSectionItem(
    modifier: Modifier,
    title: String,
    value: String,
    onClick: () -> Unit
) {

    Card(
        modifier = modifier
            .fillMaxWidth(),
        onClick = onClick,
        shape = RoundedCornerShape(4.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 1.dp,
            focusedElevation = 1.dp
        ),
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(
                modifier = Modifier,
                text = value,
                color = MaterialTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                lineHeight = 26.sp
            )

            Text(
                modifier = Modifier,
                text = title,
                color = MaterialTheme.colorScheme.tertiary,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                lineHeight = 22.sp
            )
        }
    }
}

@Preview
@Composable
fun InfoSectionItem_Preview() {


}