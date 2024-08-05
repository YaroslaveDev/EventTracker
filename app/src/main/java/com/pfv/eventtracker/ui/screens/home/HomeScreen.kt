package com.pfv.eventtracker.ui.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.pfv.eventtracker.ui.screens.home.components.HomeScreenTopBar

@Composable
fun HomeScreen(
    navController: NavController
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface,
        topBar = {
            HomeScreenTopBar(
                "title"
            )
        }
    ) {

    }
}