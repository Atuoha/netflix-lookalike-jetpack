package com.example.movieapp.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomFloating() {
    FloatingActionButton(
        onClick = { /*TODO*/ },
        containerColor = Color(0xffE8292B),
        shape = CircleShape
    ) {
        Icon(
            imageVector = Icons.Default.PlayArrow,
            contentDescription = "Play",
            tint = Color.White,
            modifier = Modifier.size(22.dp),
        )
    }
}