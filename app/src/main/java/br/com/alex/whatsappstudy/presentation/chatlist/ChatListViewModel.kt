package br.com.alex.whatsappstudy.presentation.chatlist

import androidx.lifecycle.ViewModel
import br.com.alex.whatsappstudy.core.BaseUiState
import br.com.alex.whatsappstudy.domain.ChatsUseCase
import br.com.alex.whatsappstudy.presentation.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ChatListViewModel(private val useCase: ChatsUseCase): ViewModel() {

    private val _uiState = MutableStateFlow(BaseUiState.Success(User(name = "teste", email = "teste")))
    val uiState: StateFlow<BaseUiState<User>> = _uiState
}