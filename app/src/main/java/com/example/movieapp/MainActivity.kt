package com.example.movieapp
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.movieapp.navigation.MovieNavigation
import com.example.movieapp.ui.theme.MovieAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit) {
    return MovieAppTheme {
        content()
    }
}

@Composable
fun MovieDetailsApp(content: @Composable () -> Unit) {
    MovieAppTheme {
        content()
    }
}


