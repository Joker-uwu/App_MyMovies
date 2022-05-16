package com.Eydher.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import com.Eydher.mymovies.ui.theme.MyMoviesApp
import com.Eydher.mymovies.ui.theme.screens.detail.DetailScreen
import com.Eydher.mymovies.ui.theme.screens.main.MainScreen

@ExperimentalFoundationApi
@ExperimentalCoilApi
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMoviesApp{
                    //Greeting("Android")
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "main"){
                    composable("main"){
                        MainScreen(navController)
                    }
                    composable(
                        route = "detail/{mediaId}",
                        arguments = listOf(
                            navArgument("mediaId"){type = NavType.IntType}
                        )
                    ){ backStrackEntry ->
                        val id = backStrackEntry.arguments?.getInt("mediaId")
                        requireNotNull(id, {"Error de id"})
                        DetailScreen(id)
                    }
                } //MainScreen()
                    /*var (value, onValueChange) = rememberSaveable{mutableStateOf("")}
                    StateSample( //Llamamos la vista(PREVIEW) a mostrar
                        value = value,
                        onValueChange = onValueChange
                    )*/
            }
        }//SetContent
    }
}
//Todas las funciones de compose se inician con mayusculas(A-Z), por que representan objets en la pantalla

// El PREVIEW Se utiliza para visualizer el program, porque no tenemos un diseñador (ES LO MÁS CERCANO)
// donde podriamos arrastrar las vistas

//TODO Vista 3,
//@Preview(showBackground = true, widthDp = 400, heightDp = 400) //Fondo si | Tamaño
/*@Composable
fun StateSample(value: String, onValueChange: (String) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()//Ocupe tod  el espacio
            .padding(64.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = value,
            onValueChange = {onValueChange(it)},
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Yellow)
        ) //Cuando este estado se modifique, todas las vistas se modifican automaticamente
        Text(
            text = value,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .padding(8.dp)
        )
        Button(
            onClick = {onValueChange("")},
            modifier = Modifier.fillMaxWidth(),
            enabled = value.isNotEmpty()
        ) {
            Text(text = "Clear")
        }
    }
}*/
//TODO VISTA 2,


/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}*/

// El PREVIEW Se utiliza para visualizer el program, porque no tenemos un diseñador (ES LO MÁS CERCANO)
// donde podriamos arrastrar las vistas

//@Preview(showBackground = true,widthDp = 200, heightDp = 100) //TODO VISTA 2 NAME
/*@Composable
fun ButtonText() {
    Box(modifier = Modifier.fillMaxSize(), //Tamaño
        contentAlignment = Alignment.Center //Contenido centrado
    ){
        Text( //Es recomendable que cada parametro valla en su propia linea
            text = "Hello Eydher", //Los modifier se van modificando en el orden qur se aplican
            //textAlign = TextAlign.Justify, //Justificado
            //lineHeight = 2.em, //Separación entre palabras
            //maxLines = 1,//Numero de lineas a mostrar
            //softWrap = false,//Corta la palabra sobresaliente
            style = MaterialTheme.typography.h4.copy( //Tamaño de letra
                shadow = Shadow(//Aplicarle sombra
                    offset = Offset(5f, 5f), //Angulo de la sombra
                    blurRadius = 5f, //Se acerca o aleja la sombra
                    color = Color.Green.copy(alpha = 0.5f) //Color sombra|(no) fuete la combra
                )
            )
            //overflow = TextOverflow.Ellipsis//Añade 3 puntos al final
            //textDecoration = TextDecoration.LineThrough, //Decora el texto
            //letterSpacing = 5.sp, fontFamily = FontFamily.Default, fontWeight = FontWeight.ExtraBold,
            //fontStyle = FontStyle.Italic,fontSize = 25.sp, color = Color.Green
        )
    }
}*/
