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
import com.example.movieapp.models.moviewPreviews
import com.example.movieapp.widgets.CircleImagePreview

@Composable
fun Previews() {
    Text(
        modifier = Modifier.padding(end = 18.dp),
        text = "Previews",
        style = TextStyle(
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
    )
    Spacer(modifier = Modifier.height(20.dp))
    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(moviewPreviews) { preview ->
            CircleImagePreview(item = preview)
        }
    }
}
