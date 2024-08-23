package com.pfv.eventtracker.ui.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pfv.eventtracker.ui.navigation.consts.Routes
import com.pfv.eventtracker.ui.screens.create_new_event_screen.CreateNewEventScreen
import com.pfv.eventtracker.ui.screens.home.HomeScreen
import com.pfv.eventtracker.ui.screens.manage_events_screen.ManageEventsScreen
import com.pfv.eventtracker.ui.screens.splash.SplashScreen

@Composable
fun RootNavGraph(
    navController: NavHostController
) {

    NavHost(
        navController = navController,
        startDestination = Routes.Splash
    ){

        composable<Routes.Splash>(
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(700)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(700)
                )
            }
        ){
            SplashScreen(
                navController = navController
            )
        }

        composable<Routes.HomeScreen>(
            enterTransition = {
                slideIntoContainer(
                    AnimatedContentTransitionScope.SlideDirection.Left,
                    animationSpec = tween(300)
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(300)
                )
            }
        ) {
            HomeScreen(navController = navController)
        }

        composable<Routes.ManageEventsScreenRoute> {
            ManageEventsScreen(navController = navController)
        }

        composable<Routes.CreateNewEventScreenRoute> {
            CreateNewEventScreen(navController = navController)
        }
    }
}