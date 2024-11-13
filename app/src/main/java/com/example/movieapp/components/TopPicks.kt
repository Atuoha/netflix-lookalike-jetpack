package com.example.movieapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapp.R
import com.example.movieapp.widgets.MoviePreview

@Composable
fun TopPicks() {
    val imageList = listOf(
        R.drawable.g,
        R.drawable.a,
        R.drawable.d,
        R.drawable.b,
        R.drawable.c,
        R.drawable.e,
        R.drawable.f,
    )
    Text(
        modifier = Modifier.padding(end = 18.dp),
        text = "The Top Picks!",
        style = TextStyle(
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    )
    Spacer(modifier = Modifier.height(10.dp))
    Text(
        modifier = Modifier.padding(end = 18.dp),
        text = "Spreading the watch of the season to all family and folks.",
        style = TextStyle(color = Color.White, fontSize = 16.sp)
    )
    Spacer(modifier = Modifier.height(10.dp))
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(imageList) { item ->
            MoviePreview(item = item)
        }
    }
}