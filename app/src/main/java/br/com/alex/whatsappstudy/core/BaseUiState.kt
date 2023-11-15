package br.com.alex.whatsappstudy.core

sealed class BaseUiState<out T> {
    data class Success<out T>(val data: T): BaseUiState<T>()
    data class Error(val exception: Throwable): BaseUiState<Throwable>()
}