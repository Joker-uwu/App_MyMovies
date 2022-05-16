package com.Eydher.mymovies.ui.theme.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayCircleOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.Eydher.mymovies.model.MediaItem

@ExperimentalCoilApi
@Composable
fun Thumb(item: MediaItem, modifier: Modifier = Modifier) {
    Box( //Limites de las celdas
        modifier = modifier
            .height(200.dp) //TAMAÑO
            .fillMaxWidth(), //EXPANDIRSE
        contentAlignment = Alignment.Center //CONTENIDO ALINEADO EN ESTE CASO ESTA CENTRADO
    ) {
        Image(
            painter = rememberImagePainter( //IMAGEN A MOSTRAR
                data = item.thumb,//IMAGEN VAR
            ),
            contentDescription = null, //DESCRIPCION IMAGEN
            modifier = Modifier.fillMaxSize(), //Ocupe toda lo largo(imagen)
            contentScale = ContentScale.Crop //QUE SE HAGA GRANDE
        )
        if (item.type == MediaItem.Type.VIDEO) {
            Icon(
                Icons.Default.PlayCircleOutline,//Icono
                contentDescription = null,//Sin descripción
                modifier = Modifier
                    .size(92.dp)//Tamaño
                    .align(Alignment.Center),
                tint = Color.White//Color icon
            )
        }
        //Icon(painter = painterResource(id = R.drawable.ic_playcircule), contentDescription = null)
    }
}