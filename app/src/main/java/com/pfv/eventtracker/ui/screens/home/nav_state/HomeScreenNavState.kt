package com.pfv.eventtracker.ui.screens.home.nav_state

sealed class HomeScreenNavState {

    object InitState : HomeScreenNavState()
    object NavTo_ManageEventsScreen : HomeScreenNavState()
    object NavTo_CreateNewEventScreen : HomeScreenNavState()
}