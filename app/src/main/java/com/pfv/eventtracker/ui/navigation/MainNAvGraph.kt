package com.pfv.eventtracker.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.pfv.eventtracker.ui.navigation.consts.BottomNavigationRoutes

@Composable
fun MainNavGraph() {

    val navController = rememberNavController()
    val routes = listOf(
        BottomNavigationRoutes.HomeScreen,
        BottomNavigationRoutes.EventsHistoryScreen
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
                    floatingActionButton = {
//                        FloatingActionButton(onClick = {  }) {
//                            Icon(imageVector = Icons.Filled.AddCircle, contentDescription = "")
//                        }
                    },
                    actions = {

                        routes.forEachIndexed { index, item ->

                            val isSelected by remember(currentRoute) {
                                derivedStateOf { currentRoute == item.route::class.qualifiedName }
                            }

                            NavigationBarItem(
                                icon = {
                                    Image(
                                        modifier = Modifier
                                            .width(26.dp),
                                        painter = painterResource(id = item.icon),
                                        contentDescription = "",
                                        colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                                        contentScale = ContentScale.Inside
                                    )
                                },
                                selected = isSelected,
                                onClick = {
                                    navController.navigate(item.route) {
                                        launchSingleTop = true
                                        restoreState = true
                                    }
                                },
                                colors = NavigationBarItemColors(
                                    selectedIconColor = MaterialTheme.colorScheme.onSurface,
                                    selectedTextColor = MaterialTheme.colorScheme.tertiary,
                                    selectedIndicatorColor = MaterialTheme.colorScheme.tertiary,
                                    unselectedIconColor = Color.Transparent,
                                    unselectedTextColor = MaterialTheme.colorScheme.primary,
                                    disabledIconColor = MaterialTheme.colorScheme.secondary,
                                    disabledTextColor = MaterialTheme.colorScheme.tertiary
                                )
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