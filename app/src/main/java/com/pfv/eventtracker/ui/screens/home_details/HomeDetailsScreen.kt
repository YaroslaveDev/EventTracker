package com.pfv.eventtracker.ui.screens.home_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pfv.eventtracker.ui.screens.home.components.InfoSectionItem

@Composable
fun HomeDetailsScreen(
    text: String,
    navController: NavController
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface
    ) {

        Box(
            modifier = Modifier
                .padding(it)
                .statusBarsPadding()
                .fillMaxSize(),
            contentAlignment = Alignment.TopCenter
        ){
            Text(text = text)

            Row(
                modifier = Modifier
                    .padding(horizontal = 20.dp),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    info = "0/10",
                    title = "First",
                    onClick = {}
                )

                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    info = "220$",
                    title = "Second",
                    onClick = {}
                )

                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    info = "3/4",
                    title = "Third",
                    onClick = {}
                )

                InfoSectionItem(
                    modifier = Modifier
                        .weight(1f),
                    info = "15",
                    title = "Fourth",
                    onClick = {}
                )
            }
        }
    }
}