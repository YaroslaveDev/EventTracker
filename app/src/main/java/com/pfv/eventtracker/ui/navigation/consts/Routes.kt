package com.pfv.eventtracker.ui.navigation.consts

import kotlinx.serialization.Serializable

@Serializable
sealed class Routes {

    @Serializable
    data object Splash : Routes()

    @Serializable
    data object MainNavGraph : Routes()

    @Serializable
    data object HomeNavGraph : Routes()

    @Serializable
    data object HomeDetailsNavGraph : Routes()

    @Serializable
    data object HomeScreen : Routes()

    @Serializable
    data object CalendarScreen : Routes()

    @Serializable
    data object DictionaryScreen : Routes()

    @Serializable
    data object HomeDetailsScreen : Routes()

    @Serializable
    data object HomeDetailsDeeperScreen : Routes()
}

@Serializable
sealed class BottomNavigationRoutes(val route: Routes) {

    @Serializable
    data object HomeScreen : BottomNavigationRoutes(Routes.HomeScreen)
    @Serializable
    data object CalendarScreen : BottomNavigationRoutes(Routes.CalendarScreen)
    @Serializable
    data object DictionaryScreen : BottomNavigationRoutes(Routes.DictionaryScreen)
}