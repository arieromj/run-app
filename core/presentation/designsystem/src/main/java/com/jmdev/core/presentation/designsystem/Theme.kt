package com.jmdev.core.presentation.designsystem

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

val DarkColorScheme = darkColorScheme(
    primary = RunAppGreen,
    background = RunAppBlack,
    surface = RunAppDarkGray,
    secondary = RunAppWhite,
    tertiary = RunAppWhite,
    primaryContainer = RunAppGreen30,
    onPrimary = RunAppBlack,
    onBackground = RunAppWhite,
    onSurface = RunAppWhite,
    onSurfaceVariant = RunAppGray
)

@Composable
fun RunAppTheme(
    // Dynamic color is available on Android 12+
    content: @Composable () -> Unit
) {
    val colorScheme = DarkColorScheme
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = false
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}