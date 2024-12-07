package com.example.movieapp.models

import androidx.compose.ui.graphics.Color
import com.example.movieapp.R

class MoviePreviewItem(val image: Int, val titleImage: Int, val color: Color) {
}


val moviePreviews = listOf(
    MoviePreviewItem(
        image = R.drawable.sintel,
        titleImage = R.drawable.sintel_title,
        color = Color(0xff613E33),
    ),
    MoviePreviewItem(
        image = R.drawable.umbrella_academy,
        titleImage = R.drawable.umbrella_academy_title, color = Color(0xffF1CBA6),
    ),
    MoviePreviewItem(
        image = R.drawable.black_mirror,
        titleImage = R.drawable.black_mirror_title,
        color = Color(0xff608597),
    ),
    MoviePreviewItem(
        image = R.drawable.crown,
        titleImage = R.drawable.crown_title,
        color = Color(0xff20282D),
    ),
    MoviePreviewItem(
        image = R.drawable.carole_and_tuesday,
        titleImage = R.drawable.carole_and_tuesday_title, color = Color(0xffBFDDF5),
    ),
    MoviePreviewItem(
        image = R.drawable.avatar,
        titleImage = R.drawable.atla_title,
        color = Color(0xffE75500),
    ),

    )