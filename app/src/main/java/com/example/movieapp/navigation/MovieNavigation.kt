package com.example.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.movieapp.models.Movie
import com.example.movieapp.screens.details.DetailsScreen
import com.example.movieapp.screens.home.HomeScreen
import com.google.gson.Gson

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MovieScreens.HomeScreen.name) {
        composable(MovieScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(
            route = MovieScreens.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument("movie") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val movieJson = backStackEntry.arguments?.getString("movie") ?: ""
            val movie = Gson().fromJson(movieJson, Movie::class.java)
            DetailsScreen(navController = navController, movie = movie)
        }
    }
}