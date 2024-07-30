package com.pfv.eventtracker.ui.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.pfv.eventtracker.ui.navigation.consts.Routes

@Composable
fun HomeNavGraph(
    navHostController: NavHostController
) {

    NavHost(
        navController = navHostController,
        startDestination = Routes.HomeNavGraph
    ) {

        navigation<Routes.HomeNavGraph>(
            startDestination = Routes.HomeScreen
        ){

            composable<Routes.HomeScreen>() {

                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Button(onClick = {
                        navHostController.navigate(Routes.HomeDetailsNavGraph)
                    }) {
                        Text(text = "rrrrr")
                    }
                }
            }

            composable<Routes.CalendarScreen>{

            }

            composable<Routes.DictionaryScreen>{

            }
        }

        navigation<Routes.HomeDetailsNavGraph>(
            startDestination = Routes.HomeDetailsScreen
        ){

            composable<Routes.HomeDetailsScreen> {
                //HomeDetailsScreen(navController = navHostController)
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Button(onClick = {
                        navHostController.navigate(Routes.HomeDetailsDeeperScreen)
                    }) {
                        Text(text = "HomeDetailsScreen")
                    }
                }
            }

            composable<Routes.HomeDetailsDeeperScreen> {
               // HomeDetailsScreen(navController = navHostController)
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Text(text = "HomeDetailsDeeperScreen")
                }
            }
        }
    }
}