package com.pfv.eventtracker.ui.screens.create_new_event_screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pfv.eventtracker.R
import com.pfv.eventtracker.ui.common.TitleText
import com.pfv.eventtracker.ui.screens.create_new_event_screen.components.CreateNewEventTopBar

@Composable
fun CreateNewEventScreen(
    navController: NavController
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.primary,
        topBar = {
            CreateNewEventTopBar(
                onBack = {
                    navController.navigateUp()
                }
            )
        },
    ) {

        Column(
            modifier = Modifier
                .padding(top = it.calculateTopPadding())
                .fillMaxSize()
                .background(
                    color = MaterialTheme.colorScheme.surface,
                    shape = RoundedCornerShape(topEnd = 26.dp, topStart = 26.dp)
                )
        ) {
            CreateNewEventContent(
                modifier = Modifier
                    .padding(top = 40.dp)
            )
        }
    }
}