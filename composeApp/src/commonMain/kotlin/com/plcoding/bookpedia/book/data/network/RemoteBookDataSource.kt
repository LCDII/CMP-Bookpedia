package com.plcoding.bookpedia.book.data.network

import com.plcoding.bookpedia.book.data.dto.SearchResponseDto
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.Result

interface RemoteBookDataSource { //we need it if want to change ktor to another library, just create antorher class implements this interface
    suspend fun searchBooks(
        query : String,
        resultLimit : Int? = null
    ) : Result<SearchResponseDto, DataError.Remote>
}