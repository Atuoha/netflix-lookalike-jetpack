package com.example.movieapp.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.movieapp.R


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun AppBar() {
    TopAppBar(
        title = {
            Image(
                modifier = Modifier.width(80.dp),
                painter = painterResource(id = R.drawable.netflix_logo1),
                contentDescription = "Logo"
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White
        )
    )
}