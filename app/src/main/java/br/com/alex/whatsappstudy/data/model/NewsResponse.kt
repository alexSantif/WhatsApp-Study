package br.com.alex.whatsappstudy.data.model

data class NewsResponse(
    val status: String? = null,
    val totalResults: Int? = null,
    val articles: List<News>? = null,
)