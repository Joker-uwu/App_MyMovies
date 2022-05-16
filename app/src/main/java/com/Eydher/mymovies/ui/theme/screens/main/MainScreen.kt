package com.Eydher.mymovies.ui.theme.screens.main

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import coil.annotation.ExperimentalCoilApi

@ExperimentalCoilApi
@ExperimentalFoundationApi
@Composable
fun MainScreen(navController: NavHostController) {
    Scaffold(
        topBar = { MainAppBar() }
    ) { padding ->
        MediaList(navController, Modifier.padding(padding))//Llamamos la vista(PREVIEW) a mostrar
    }
}