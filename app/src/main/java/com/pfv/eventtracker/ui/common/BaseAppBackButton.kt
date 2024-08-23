package com.pfv.eventtracker.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pfv.eventtracker.R

@Composable
fun BaseAppBackButton(
    modifier: Modifier,
    onClick: () -> Unit
) {

    IconButton(
        modifier = modifier
            .size(
                36.dp
            )
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(10.dp)
            ),
        onClick = onClick,
        colors = IconButtonDefaults.iconButtonColors(),
    ) {

        Icon(
            painter = painterResource(id = R.drawable.ic_arrow),
            contentDescription = "img",
            tint = MaterialTheme.colorScheme.onSurface
        )
    }
}