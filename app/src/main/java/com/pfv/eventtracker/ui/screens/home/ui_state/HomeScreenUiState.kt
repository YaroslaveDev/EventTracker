package com.pfv.eventtracker.ui.screens.home.ui_state

sealed class HomeScreenUiState {

    object InitState : HomeScreenUiState()
    object SetupState : HomeScreenUiState()
    object JoinChatByCodePopup : HomeScreenUiState()
}