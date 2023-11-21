package br.com.alex.whatsappstudy.data.repository

import br.com.alex.whatsappstudy.data.api.AppResult
import br.com.alex.whatsappstudy.data.api.NewsApi
import br.com.alex.whatsappstudy.data.api.handleApiError
import br.com.alex.whatsappstudy.data.api.handleSuccess
import br.com.alex.whatsappstudy.data.model.NewsResponse

class ChatsRepositoryImpl(private val api: NewsApi) : ChatsRepository {

    override suspend fun getNews(): AppResult<NewsResponse> {
        return try {
            val response = api.getNews("us", "126c1e71e05c42f9861a3da85a29c75b")
            if (response.isSuccessful) {
                handleSuccess(response)
            } else {
                handleApiError(response)
            }
        } catch (e: Exception) {
            AppResult.Error(e)
        }
    }
}