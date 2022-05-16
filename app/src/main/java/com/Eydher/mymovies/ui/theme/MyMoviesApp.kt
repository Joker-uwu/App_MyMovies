package com.Eydher.mymovies.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable

@Composable
fun MyMoviesApp(content: @Composable () -> Unit) {
    MyMoviesTheme {
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}