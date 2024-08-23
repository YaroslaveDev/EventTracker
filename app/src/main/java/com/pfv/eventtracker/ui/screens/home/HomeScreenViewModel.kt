package com.pfv.eventtracker.ui.screens.home

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.pfv.eventtracker.ui.screens.home.event.HomeScreenEvent
import com.pfv.eventtracker.ui.screens.home.nav_state.HomeScreenNavState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor() : ViewModel() {

    var navState by mutableStateOf<HomeScreenNavState>(HomeScreenNavState.InitState)

    fun reduceEvent(event: HomeScreenEvent){

        when(event){
            HomeScreenEvent.CreateNewEvent -> updateNavState(HomeScreenNavState.NavTo_CreateNewEventScreen)
            is HomeScreenEvent.JoinToChatByKey -> {}
            HomeScreenEvent.NavToManageEventsScreen -> updateNavState(HomeScreenNavState.NavTo_ManageEventsScreen)
            HomeScreenEvent.NavToJoinChatByCodeScreen -> {}
            HomeScreenEvent.NavToQrCodeDetectionScreen -> {}
            is HomeScreenEvent.OnInputOtpCode -> {}
            HomeScreenEvent.ResetPopupState -> {}
        }
    }

    fun updateNavState(state: HomeScreenNavState){
        navState = state
    }

    fun resetNavState() = updateNavState(HomeScreenNavState.InitState)

}