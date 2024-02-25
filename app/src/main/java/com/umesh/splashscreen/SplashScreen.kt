package com.umesh.splashscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.umesh.splashscreen.navigation.Screen

@Composable
fun SplashScreen(navHostController: NavHostController) {
    Box (modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)){
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.logo))
        val logoAnimatedState = animateLottieCompositionAsState(composition = composition)

        LottieAnimation(composition = composition, progress = { logoAnimatedState.progress })

        if (logoAnimatedState.isAtEnd && logoAnimatedState.isPlaying) {
            navHostController.navigate(Screen.Home.route)
        }
    }
}