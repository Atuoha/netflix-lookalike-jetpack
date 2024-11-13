package com.example.movieapp.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.movieapp.models.Movie

@Composable
fun MovieSection(
    title: String,
    movieList: List<Movie>, navController: NavController
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(end = 18.dp),
            text = title,
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp
            )
        )
        Text(
            modifier = Modifier.padding(end = 18.dp),
            text = "See all",
            style = TextStyle(
                color = Color.White,
                fontSize = 14.sp
            )
        )
    }

    Spacer(modifier = Modifier.height(10.dp))
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(movieList) { movie ->
            MovieShowcase(item = movie, navController = navController)
        }
    }
}