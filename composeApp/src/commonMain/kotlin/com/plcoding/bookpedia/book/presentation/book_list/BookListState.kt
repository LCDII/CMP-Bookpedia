package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

val books = (1..100).map {
    Book(
        id = it.toString(),
        title = "Book $it",
        imageURL = "https://notworking.com",
        authors = listOf("LevPiskunov"),
        description = "Description $it",
        languages = emptyList(),
        publishedYear = null,
        averageRating = 4.5,
        ratingCount = 5,
        numberOfPages = 300,
        numberOfEditions = 2
    )
}
data class BookListState(//Just all variables we use while BookList layer is working
    val searchQuery: String = "Kotlin",
    val searchResult: List<Book> = emptyList(),
    val favoriteBooks : List<Book> = emptyList(),
    val isLoading: Boolean = true,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)
