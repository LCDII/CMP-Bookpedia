package com.plcoding.bookpedia.book.domain

//just our model. Book - is concept, what book has. We implements it in DATA class because book do nothing. Its only stores data
data class Book(
    val id: String,
    val title: String,
    val imageURL: String,
    val authors : List<String>,
    val description : String?,
    val languages : List<String>,
    val publishedYear : String?,
    val averageRating : Double?, //? stands for null, because not every book has rating
    val ratingCount : Int?,
    val numberOfPages : Int?,
    val numberOfEditions : Int
)
