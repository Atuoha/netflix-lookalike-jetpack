package com.example.movieapp.screens.home

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.components.CarouselComponent
import com.example.movieapp.components.MovieSection
import com.example.movieapp.components.Previews
import com.example.movieapp.components.TopPicks
import com.example.movieapp.models.myPlaylist
import com.example.movieapp.models.newlyReleased
import com.example.movieapp.models.thisWeek
import com.example.movieapp.widgets.AppBar
import com.example.movieapp.widgets.CustomFloating

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        floatingActionButton = {
            CustomFloating()
        },
        topBar = {
            AppBar()
        }) {
        MainContent(navController = navController)
    }
}

@Composable
fun MainContent(navController: NavController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.Black
    ) {
        Column(
            modifier = Modifier
                .padding(start = 18.dp, top = 80.dp)
                .verticalScroll(
                    rememberScrollState()
                )
        ) {
            TopPicks()
            Spacer(modifier = Modifier.height(20.dp))
            MovieSection(
                title = "Newly Released",
                movieList = newlyReleased,
                navController = navController,
            )
            Spacer(modifier = Modifier.height(20.dp))
            Previews()
            Spacer(modifier = Modifier.height(20.dp))
            MovieSection(
                title = "My Playlist",
                movieList = myPlaylist,
                navController = navController,
            )
            Spacer(modifier = Modifier.height(20.dp))
            CarouselComponent()
            Spacer(modifier = Modifier.height(20.dp))
            MovieSection(
                title = "This Week", movieList = thisWeek,
                navController = navController
            )
        }
    }
}