package com.pfv.eventtracker.ui.screens.home.event

sealed class HomeScreenEvent {

    object NavToChatsListScreen : HomeScreenEvent()
    object ResetPopupState : HomeScreenEvent()
    object NavToQrCodeDetectionScreen : HomeScreenEvent()
    object NavToJoinChatByCodeScreen : HomeScreenEvent()
    data class JoinToChatByKey(val id: String) : HomeScreenEvent()
    data class OnInputOtpCode(val code: String) : HomeScreenEvent()
    object CreateChat : HomeScreenEvent()
}