package com.pfv.eventtracker.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pfv.eventtracker.R
import com.pfv.eventtracker.ui.navigation.consts.Routes
import kotlinx.coroutines.delay

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SplashScreen(
    navController: NavController
) {

    var firstAnimationFlag by rememberSaveable{
        mutableStateOf(false)
    }
    var secondAnimationFlag by rememberSaveable{
        mutableStateOf(false)
    }

    LaunchedEffect(Unit) {
        firstAnimationFlag = true
        secondAnimationFlag = true
        delay(3000)
        navController.navigate(Routes.MainNavGraph)
    }

    val rotation1 by animateFloatAsState(
        targetValue = if (firstAnimationFlag) 360f else 0f,
        label = "",
        animationSpec = tween(durationMillis = 3000, easing = FastOutSlowInEasing)
    )
    val rotation2 by animateFloatAsState(
        targetValue = if (firstAnimationFlag) -360f else 0f,
        label = "",
        animationSpec = tween(durationMillis = 3000, easing = FastOutSlowInEasing, delayMillis = 300)
    )

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = MaterialTheme.colorScheme.surface
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f),
                contentAlignment = Alignment.Center
            ){
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .rotate(
                            rotation1
                        )
                        .padding(16.dp),
                    painter = painterResource(id = R.drawable.ic_splash_logo_outside_2),
                    contentDescription = "img",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                    contentScale = ContentScale.Inside
                )

                Image(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .rotate(
                            rotation2
                        )
                        .padding(16.dp),
                    painter = painterResource(id = R.drawable.ic_splash_logo_outside_1),
                    contentDescription = "img",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                    contentScale = ContentScale.Inside
                )

                Image(
                    modifier = Modifier
                        .fillMaxWidth(0.6f)
                        .padding(16.dp),
                    painter = painterResource(id = R.drawable.ic_splash_logo_center),
                    contentDescription = "img",
                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onSurface),
                    contentScale = ContentScale.Inside
                )
            }
        }
    }
}