package br.com.alex.whatsappstudy.data

class ChatsRepositoryImpl(private val api: NewsApi) : ChatsRepository {

//    override suspend fun getNews(): AppResult<MoviesResponse> {
//        return try {
//            val response = api.getMovies()
//            if (response.isSuccessful) {
//                handleSuccess(response)
//            } else {
//                handleApiError(response)
//            }
//        } catch (e: Exception) {
//            AppResult.Error(e)
//        }
//    }
}