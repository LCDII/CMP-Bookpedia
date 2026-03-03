package com.plcoding.bookpedia.book.presentation.book_list

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import org.koin.compose.viewmodel.koinViewModel

//CONATINER
@Composable
fun BookListScreenRoot(//knows about view model

    viewModel: BookListViewModel = koinViewModel(),
    onBookClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val state by viewModel.state.collectAsStateWithLifecycle()//subscription Flow on State, when it changed UI changes
    BookListScreen(
        state = state,
        onAction = viewModel::onAction//lambda
    )
}

//CONTENT
//its isolated and can be reused
@Composable
private fun BookListScreen(//just for UI
    state: BookListState, // it doesnt Know it depends on viewmodel, its just State
    onAction : (BookListAction)  -> Unit,
    modifier: Modifier = Modifier
) {

}