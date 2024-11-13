package com.example.movieapp.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.movieapp.models.MoviePreviewItem
import com.example.movieapp.models.moviewPreviews

@Composable
fun CircleImagePreview(item: MoviePreviewItem = moviewPreviews[1]) {
    Box(modifier = Modifier
        .padding(end = 10.dp)
        .background(color = item.color, shape = CircleShape)
        .size(150.dp)
        .clipToBounds()){
        Image(
            modifier = Modifier
                .padding(10.dp)
                .size(150.dp)
                .clip(shape = CircleShape)
                .fillMaxWidth(),
            painter = painterResource(id = item.image), contentDescription = "Image", contentScale = ContentScale.FillWidth
        )

        Image(
            painter = painterResource(id = item.titleImage),
            contentDescription = "Overlay Image",
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .offset(y = 2.dp)
        )
    }

}