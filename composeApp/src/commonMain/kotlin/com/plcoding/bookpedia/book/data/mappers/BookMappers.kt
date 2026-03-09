package com.plcoding.bookpedia.book.data.mappers

import com.plcoding.bookpedia.book.data.dto.SearchedBookDto
import com.plcoding.bookpedia.book.domain.Book

fun SearchedBookDto.toBook() : Book
{
    return Book(
        id = id,
        title = title,
        imageURL =
            if (coverKey != null) {
                "https://covers.openlibrary.org/b/olid/${coverKey}-L.jpg"
            } else {
                "https://covers.openlibrary.org/b/olid/${coverAlternativeKey}-L.jpg"
            },
        authors = authorNames ?: emptyList(),// ?: -  isNull()
        description = null,
        languages = languages ?: emptyList(),
        publishedYear = firstPublishYear.toString(),
        averageRating = ratingsAverage,
        ratingCount = ratingsCount,
        numberOfPages = numberOfPagesMedian,
        numberOfEditions = numberOfEditions ?: 0
    )
}