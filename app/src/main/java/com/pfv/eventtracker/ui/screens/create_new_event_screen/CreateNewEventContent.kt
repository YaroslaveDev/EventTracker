package com.pfv.eventtracker.ui.screens.create_new_event_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CreateNewEventContent(
    modifier: Modifier
) {

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Title")
            }
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Description")
            }
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Time")
            }
        )

        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = "",
            onValueChange = {},
            label = {
                Text(text = "Location")
            }
        )
    }
}