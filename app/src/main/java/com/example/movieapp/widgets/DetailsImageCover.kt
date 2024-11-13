package com.example.movieapp.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.movieapp.models.Movie

@Composable
fun DetailsImageCover(movie: Movie) {
    Image(
        painter = painterResource(id = movie.movieImageResId),
        contentDescription = "Image",
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .clip(
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomStart = 20.dp,
                    bottomEnd = 20.dp,
                ),
            ),

        contentScale = ContentScale.FillWidth,
        alignment = Alignment.Center
    )
}