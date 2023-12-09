package br.com.alex.whatsappstudy.presentation.chat

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.alex.whatsappstudy.core.BaseUiState
import br.com.alex.whatsappstudy.data.api.onFailure
import br.com.alex.whatsappstudy.data.api.onSuccess
import br.com.alex.whatsappstudy.data.model.ChatsResponse
import br.com.alex.whatsappstudy.domain.ChatsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ChatViewModel(private val useCase: ChatsUseCase) : ViewModel() {

    private val _uiState = MutableStateFlow(BaseUiState.Success<ChatsResponse?>(ChatsResponse()))
    val uiState = _uiState.asStateFlow()

    fun getNews() {
        viewModelScope.launch {
            useCase.getNews().onSuccess {
                _uiState.value = BaseUiState.Success(it)
            }.onFailure {
//                _uiState.value = BaseUiState.Error(it)
            }
        }
    }
}