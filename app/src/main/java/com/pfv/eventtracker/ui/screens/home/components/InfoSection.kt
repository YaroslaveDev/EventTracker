package com.pfv.eventtracker.ui.screens.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
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

@Composable
fun InfoSectionItem(
    modifier: Modifier,
    title: String,
    info: String,
    onClick: () -> Unit
) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth(),
            onClick = onClick,
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFebece9)
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 12.dp,
                focusedElevation = 12.dp
            ),
            ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Text(
                    modifier = Modifier
                        .padding(
                            bottom = 10.dp,
                            top = 20.dp
                        ),
                    text = title,
                    color = MaterialTheme.colorScheme.surface,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold
                )

                Icon(
                    modifier = Modifier
                        .align(
                            alignment = Alignment.CenterHorizontally
                        )
                        .size(40.dp),
                    imageVector = Icons.Filled.DateRange,
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.surface
                )

                Text(
                    modifier = Modifier
                        .padding(
                            bottom = 20.dp,
                            top = 10.dp
                        ),
                    text = info.uppercase(),
                    color = MaterialTheme.colorScheme.surface,
                    textAlign = TextAlign.Center
                )
            }
        }
    }

}

@Preview
@Composable
fun InfoSectionItem_Preview() {


}