package com.example.movieapp.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapp.R
import com.example.movieapp.widgets.CarouselImage
import kotlinx.coroutines.delay

@Composable
fun CarouselComponent() {
    val carouselImages = listOf(
        R.drawable.net5,
        R.drawable.net3,
        R.drawable.net6,
        R.drawable.net2,
        R.drawable.net1,
        R.drawable.net4,

        )
    val pagerState = rememberPagerState(pageCount = { carouselImages.size })

    LaunchedEffect(Unit) {
        while (true) {
            delay(3000)
            val nextPage = (pagerState.currentPage + 1) % carouselImages.size
            pagerState.animateScrollToPage(nextPage)
        }
    }
    Text(
        modifier = Modifier.padding(end = 18.dp),
        text = "Highlights",
        style = TextStyle(
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 25.sp
        )
    )
    Spacer(modifier = Modifier.height(10.dp))
    HorizontalPager(
        state = pagerState,
        modifier = Modifier
            .fillMaxSize()
    ) { page ->
        CarouselImage(item = carouselImages[page])
    }
}