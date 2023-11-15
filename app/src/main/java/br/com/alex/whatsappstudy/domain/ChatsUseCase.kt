package br.com.alex.whatsappstudy.domain

import br.com.alex.whatsappstudy.data.ChatsRepository

class ChatsUseCase(private val repository: ChatsRepository) {

//    suspend fun getNews(): MovieModel? {
//        return when (val moviesResult = repository.getMovies()) {
//            is AppResult.Success -> {
//                mapResponse(moviesResult.successData)
//            }
//            is AppResult.Error -> {
//                mapError(moviesResult.exception.message)
//            }
//            else -> null
//        }
//    }
}