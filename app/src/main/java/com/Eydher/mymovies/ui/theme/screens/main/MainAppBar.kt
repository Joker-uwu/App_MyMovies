package com.Eydher.mymovies.ui.theme.screens.main

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import com.Eydher.mymovies.R

@Composable
fun MainAppBar() {
    TopAppBar(
        title = {
            Text(text = stringResource(id = R.string.app_name))
        },
        actions = {
            AppBarAction(
                imageVector = Icons.Default.Search,
                onclick = { /**/ }
            )
            AppBarAction(
                imageVector = Icons.Default.Share,
                onclick = { /**/ }
            )

        }
        /*navigationIcon = {
            IconButton(onClick = { /* */ }) {//Boton que contiene un icon
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = null
                )
            }
        }*/
    )
}

@Composable
private fun AppBarAction(
    imageVector: ImageVector,
    onclick: () -> Unit
) {
    IconButton(onClick = onclick) {//Boton que contiene un icon
        Icon(
            imageVector = imageVector,
            contentDescription = null
        )
    }
}