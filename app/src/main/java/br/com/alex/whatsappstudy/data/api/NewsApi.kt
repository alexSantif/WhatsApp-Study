package br.com.alex.whatsappstudy.data.api

import br.com.alex.whatsappstudy.data.model.ChatsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET(TOP_HEADLINES)
    suspend fun getNews(@Query("country") country: String, @Query("apiKey") apiKey: String): Response<ChatsResponse>

    companion object {

        private const val TOP_HEADLINES = "top-headlines"
    }
}