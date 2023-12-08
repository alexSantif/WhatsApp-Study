package br.com.alex.whatsappstudy.data.model

data class Chat(
    val author: String? = null,
    val urlToImage: String? = null,
    val messages: List<Message>? = null
)