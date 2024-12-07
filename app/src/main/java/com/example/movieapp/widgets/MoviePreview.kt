package com.example.movieapp.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CarouselImage(item: Int) {
    Image(
        modifier = Modifier
            .padding(end = 10.dp)
            .fillMaxWidth()
            .clip(shape = RoundedCornerShape(10.dp)),
        painter = painterResource(id = item), contentDescription = "Image"
    )
}