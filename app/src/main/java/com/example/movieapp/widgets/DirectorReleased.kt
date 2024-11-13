package com.example.movieapp.widgets

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import com.example.movieapp.models.Movie

@Composable
fun DirectorReleased(movie: Movie) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = buildAnnotatedString {
                append("Director: ")
                withStyle(
                    style = SpanStyle(
                        fontWeight =
                        FontWeight.Medium
                    )
                ) {
                    append(movie.director)
                }
            }
        )
        Text(
            text = buildAnnotatedString {
                append("Released: ")
                withStyle(
                    style = SpanStyle(
                        fontWeight =
                        FontWeight.Medium
                    )
                ) {
                    append(movie.releaseYear.toString())
                }
            }
        )
    }
}