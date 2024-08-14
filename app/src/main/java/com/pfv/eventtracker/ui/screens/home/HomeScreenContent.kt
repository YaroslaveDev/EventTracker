package com.pfv.eventtracker.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pfv.eventtracker.R
import com.pfv.eventtracker.ui.common.BaseButton
import com.pfv.eventtracker.ui.common.BaseCircularButton
import com.pfv.eventtracker.ui.common.BaseLogo
import com.pfv.eventtracker.ui.common.DividerOr
import com.pfv.eventtracker.ui.screens.home.event.HomeScreenEvent

@Composable
fun HomeScreenContent(
    onEvent: (HomeScreenEvent) -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        BaseLogo(
            frontImg = R.drawable.ic_splash_logo_center,
            reverseImg = R.drawable.ic_splash_logo_center,
            modifier = Modifier
                .padding(20.dp)
                .size(70.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            BaseButton(
                modifier = Modifier
                    .weight(1f),
                text = stringResource(id = R.string.create_new_event),
                onClick = {
                    onEvent(HomeScreenEvent.CreateChat)
                }
            )

            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(
                        color = MaterialTheme.colorScheme.primary,
                        shape = RoundedCornerShape(8.dp)
                    )
                    .clickable {
                        onEvent(HomeScreenEvent.NavToChatsListScreen)
                    },
                contentAlignment = Alignment.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = "img",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.background)
                )
            }
        }

        DividerOr()

        Text(
            text = stringResource(id = R.string.join_to_event_by),
            fontSize = 16.sp,
        )

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            BaseCircularButton(
                img = R.drawable.ic_qr,
                onClick = {
                    onEvent(HomeScreenEvent.NavToQrCodeDetectionScreen)
                }
            )

            Spacer(modifier = Modifier.width(30.dp))

            BaseCircularButton(
                img = R.drawable.ic_key,
                onClick = {
                    onEvent(HomeScreenEvent.NavToJoinChatByCodeScreen)
                }
            )
        }

    }
}