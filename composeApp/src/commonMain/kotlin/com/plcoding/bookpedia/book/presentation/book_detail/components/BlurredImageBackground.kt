package com.plcoding.bookpedia.book.presentation.book_detail.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter

@Composable
fun BlurredImageBackground(
    imageUrl: String?,
    isFaborite: Boolean,
    onFavoriteClick: () -> Unit,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    var imageLoadResult by remember {
        mutableStateOf<Result<Painter>?>(null)
    }

}