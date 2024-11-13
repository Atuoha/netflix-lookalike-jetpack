package com.example.movieapp.widgets

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RatingStars() {
    Row {
        Icon(
            imageVector = Icons.Default.Star, contentDescription = "Icon",
            tint = Color(0xffF89129),
            modifier = Modifier.size(16.dp),
        )
        Icon(
            imageVector = Icons.Default.Star, contentDescription = "Icon",
            tint = Color(0xffF89129),
            modifier = Modifier.size(16.dp),
        )
        Icon(
            imageVector = Icons.Default.Star, contentDescription = "Icon",
            tint = Color(0xffF89129),
            modifier = Modifier.size(16.dp),
        )
        Icon(
            imageVector = Icons.Default.Star, contentDescription = "Icon",
            tint = Color(0xffF89129),
            modifier = Modifier.size(16.dp),
        )
        Icon(
            imageVector = Icons.Default.Star, contentDescription = "Icon",
            tint = Color(0xffF89129),
            modifier = Modifier.size(16.dp),
        )

    }
}