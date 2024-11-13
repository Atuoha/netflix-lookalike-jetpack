package com.example.movieapp.screens.details

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.movieapp.MovieDetailsApp
import com.example.movieapp.models.Movie
import com.example.movieapp.models.newlyReleased
import com.example.movieapp.widgets.CustomFloating
import com.example.movieapp.widgets.DetailsImageCover
import com.example.movieapp.widgets.DirectorReleased
import com.example.movieapp.widgets.RatingStars

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController,movie: Movie) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Scaffold(
            modifier = Modifier.fillMaxWidth(),
            floatingActionButton = {
                CustomFloating()
            },
            topBar = {
                TopAppBar(
                    navigationIcon = {},
                    title = {
                        Box(

                            modifier = Modifier
                                .size(40.dp)
                                .clickable  { navController.popBackStack() }

                                .background(
                                    Color.Gray.copy(alpha = 0.1f),

                                    shape = CircleShape,

                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = "Back",
                                tint = Color.White
                            )
                        }
                    },
                    colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                        containerColor = Color.Transparent,
                    )
                )

            },
            content = {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 0.dp)
                ) {
                    MovieDetails(movie = movie)
                }
            }
        )
    }
}


@Composable
fun MovieDetails(movie: Movie = newlyReleased[3]) {
    MovieDetailsApp {
        Column {

            DetailsImageCover(movie)
            Spacer(modifier = Modifier.height(15.dp))
            Column(
                modifier = Modifier.padding(
                    start = 18.dp,
                    end = 18.dp
                )
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = movie.name,
                        style = TextStyle(
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        ),
                    )
                    RatingStars()
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = movie.desc,
                    style = TextStyle(
                        fontSize = 15.sp,
                        textAlign = TextAlign.Justify,
                    ),
                )
                Spacer(modifier = Modifier.height(15.dp))
                DirectorReleased(movie)
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    modifier = Modifier.padding(end = 18.dp),
                    text = "Narration",
                    style = TextStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Medium,
                        fontSize = 20.sp
                    )
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = movie.narration,
                    style = TextStyle(
                        fontSize = 15.sp,
                        textAlign = TextAlign.Justify,
                    ),
                )
            }


        }
    }

}