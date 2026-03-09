package com.plcoding.bookpedia.book.data.repository

import com.plcoding.bookpedia.book.data.mappers.toBook
import com.plcoding.bookpedia.book.data.network.RemoteBookDataSource
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.domain.BookRepository
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map

//data->domain
class DefaultBookRepository (
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository{
    override suspend fun searchBooks(query : String) : Result<List<Book>, DataError.Remote> {
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }//we receive SearchResponseDto and need List<Book> out of it, we use extension fun from Result.kt and toBook from BookMappers
    }
}