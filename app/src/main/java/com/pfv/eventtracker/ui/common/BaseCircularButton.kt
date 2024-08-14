package com.pfv.eventtracker.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BaseCircularButton(
    img: Int,
    onClick: () -> Unit
) {

    Box(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape
            )
            .clip(shape = CircleShape)
            .clickable {
                onClick()
            },
        contentAlignment = Alignment.Center
    ){

        Image(
            modifier = Modifier
                .padding(20.dp)
                .size(60.dp),
            painter = painterResource(id = img),
            contentDescription = "img",
            contentScale = ContentScale.Crop,
            colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.background)
        )
    }
}