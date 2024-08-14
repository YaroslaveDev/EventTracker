package com.pfv.eventtracker.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.wajahatkarim.flippable.Flippable
import com.wajahatkarim.flippable.rememberFlipController
import kotlinx.coroutines.delay

@Composable
fun BaseLogo(
    frontImg: Int,
    reverseImg: Int,
    modifier: Modifier = Modifier
        .padding(40.dp)
        .size(120.dp)
) {

    val flipController = rememberFlipController()

    LaunchedEffect(Unit){
        delay(1000)
        flipController.flipToBack()
    }

    Box(
        modifier = Modifier
            .background(
                color = MaterialTheme.colorScheme.primary,
                shape = CircleShape
            ),
        contentAlignment = Alignment.Center
    ) {
        Flippable(
            frontSide = {
                Image(
                    modifier = modifier,
                    painter = painterResource(id = frontImg),
                    contentDescription = "img",
                    contentScale = ContentScale.Inside,
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.surface)
                )
            },
            backSide = {
                Image(
                    modifier = modifier,
                    painter = painterResource(id = reverseImg),
                    contentDescription = "img",
                    contentScale = ContentScale.Inside,
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.surface)
                )
            },
            flipController = flipController
        )
    }
}