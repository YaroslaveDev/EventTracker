package com.pfv.eventtracker.ui.screens.home.screen_state

sealed class HomeScreenState {

    object BaseScreen : HomeScreenState()
    object ScanQrCodeScreen : HomeScreenState()
}