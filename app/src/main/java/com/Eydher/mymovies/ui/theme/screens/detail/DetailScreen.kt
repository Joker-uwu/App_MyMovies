package com.Eydher.mymovies.ui.theme.screens.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import coil.annotation.ExperimentalCoilApi
import com.Eydher.mymovies.model.getMedia
import com.Eydher.mymovies.ui.theme.screens.common.Thumb

@ExperimentalCoilApi
@Composable
fun DetailScreen(mediaId:Int) {

    val mediaItem = remember{ getMedia().first {it.id == mediaId} }
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = mediaItem.title) }) }
    ) { padding ->
        Thumb(item = mediaItem, Modifier.padding(padding))
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
            Text(
                text = "Lindo paisaje numero: '$mediaId'" + "Paisaje encontrado desde google",
                style = MaterialTheme.typography.h4,
                fontFamily = FontFamily.Default,
                color = Color.Black,
                fontWeight = FontWeight.Medium,
                fontStyle = FontStyle.Italic
            )
        }
    }