package br.com.alex.whatsappstudy.domain

import br.com.alex.whatsappstudy.data.api.AppResult
import br.com.alex.whatsappstudy.data.model.NewsResponse
import br.com.alex.whatsappstudy.data.repository.ChatsRepository

class ChatsUseCase(private val repository: ChatsRepository) {

    suspend fun getNews(): AppResult<NewsResponse?> {
        return repository.getNews()
    }
}