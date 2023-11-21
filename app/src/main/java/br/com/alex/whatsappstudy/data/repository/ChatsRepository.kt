package br.com.alex.whatsappstudy.data.repository

import br.com.alex.whatsappstudy.data.api.AppResult
import br.com.alex.whatsappstudy.data.model.NewsResponse

interface ChatsRepository {

    suspend fun getNews(): AppResult<NewsResponse>
}