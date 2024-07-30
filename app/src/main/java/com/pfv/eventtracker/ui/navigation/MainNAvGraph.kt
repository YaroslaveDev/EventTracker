package com.pfv.eventtracker.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.util.fastForEachIndexed
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pfv.eventtracker.ui.navigation.consts.BottomNavigationRoutes
import com.pfv.eventtracker.ui.navigation.consts.Routes

@Composable
fun MainNavGraph() {

    val navController = rememberNavController()
    val routes = listOf(
        BottomNavigationRoutes.HomeScreen,
        BottomNavigationRoutes.CalendarScreen,
        BottomNavigationRoutes.DictionaryScreen
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
        ?: BottomNavigationRoutes.HomeScreen::class.qualifiedName.orEmpty()
    val bottomBarDestination =
        routes.any { it.route::class.qualifiedName.orEmpty() == currentRoute }

    Scaffold(
        bottomBar = {

            if (bottomBarDestination) {
                BottomAppBar(

                    actions = {

                        routes.forEachIndexed { index, item ->

                            val isSelected by remember(currentRoute) {
                                derivedStateOf { currentRoute == item.route::class.qualifiedName }
                            }

                            NavigationBarItem(
                                icon = {
                                    Icon(
                                        imageVector = Icons.Filled.AccountBox,
                                        contentDescription = ""
                                    )
                                },
                                selected = isSelected,
                                onClick = {
                                    navController.navigate(item.route) {
                                        launchSingleTop = true
                                        restoreState = true
                                    }
                                }
                            )
                        }
                    },
                )
            }
        }
    ) { innerPadding ->

        HomeNavGraph(
            navHostController = navController
        )
    }
}