package com.pfv.eventtracker.ui.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.pfv.eventtracker.ui.navigation.consts.Routes
import com.pfv.eventtracker.ui.screens.home.nav_state.HomeScreenNavState

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeScreenViewModel = hiltViewModel()
) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface,
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ){
            HomeScreenContent(
                onEvent = viewModel::reduceEvent
            )
        }
    }

    LaunchedEffect(viewModel.navState) {

        when(viewModel.navState){
            HomeScreenNavState.InitState -> {}
            HomeScreenNavState.NavTo_ManageEventsScreen -> {
                navController.navigate(Routes.ManageEventsScreenRoute){
                    viewModel.resetNavState()
                }
            }

            HomeScreenNavState.NavTo_CreateNewEventScreen -> {
                navController.navigate(Routes.CreateNewEventScreenRoute){
                    viewModel.resetNavState()
                }
            }
        }
    }
}