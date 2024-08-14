package com.pfv.eventtracker.ui.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pfv.eventtracker.R

@Composable
fun DividerOr() {

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Divider(
            modifier = Modifier
                .weight(1f),
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary
        )

        Text(
            modifier = Modifier
                .padding(horizontal = 10.dp),
            text = stringResource(id = R.string.or)
        )

        Divider(
            modifier = Modifier
                .weight(1f),
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary
        )
    }
}