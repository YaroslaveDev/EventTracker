package com.pfv.eventtracker.ui.screens.create_new_event_screen.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.pfv.eventtracker.R
import com.pfv.eventtracker.ui.common.BaseAppBackButton
import com.pfv.eventtracker.ui.common.TitleText

@Composable
fun CreateNewEventTopBar(
    onBack: () -> Unit
){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
    ){

        BaseAppBackButton(
            modifier = Modifier
                .padding(start = 16.dp)
                .align(alignment = Alignment.CenterStart),
            onClick = onBack
        )

        TitleText(
            modifier = Modifier
                .padding(vertical = 40.dp)
                .align(alignment = Alignment.Center),
            text = stringResource(id = R.string.create_new_event_cap),
            color = MaterialTheme.colorScheme.surface,
        )
    }
}