package com.example.movieapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.movieapp.models.Movie
import com.example.movieapp.navigation.MovieScreens
import com.google.gson.Gson

@Composable
fun MovieShowcase(item: Movie, navController: NavController) {
    Image(
        modifier = Modifier
            .padding(end = 10.dp)
            .clip(shape = RoundedCornerShape(10.dp))
            .clickable {
                val movieJson = Gson().toJson(item)
                navController.navigate("${MovieScreens.DetailsScreen.name}/$movieJson")
            },
        painter = painterResource(id = item.movieImageResId),
        contentDescription = "Image"
    )
}