package com.pfv.eventtracker.ui.navigation.consts

import com.pfv.eventtracker.R
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
sealed class BottomNavigationRoutes(val route: Routes, val icon: Int) {

    @Serializable
    data object HomeScreen : BottomNavigationRoutes(Routes.HomeScreen, R.drawable.ic_home)
    @Serializable
    data object CalendarScreen : BottomNavigationRoutes(Routes.CalendarScreen, R.drawable.ic_history)
    @Serializable
    data object EventsHistoryScreen : BottomNavigationRoutes(Routes.DictionaryScreen, R.drawable.ic_history)
}