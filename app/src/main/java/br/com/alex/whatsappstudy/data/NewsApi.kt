package br.com.alex.whatsappstudy.data

interface NewsApi {

//    @GET("$POPULAR_MOVIES")
//    suspend fun getNews(): Response<MoviesResponse>

    companion object {

        private const val POPULAR_MOVIES = "mostpopularmovies/"
    }
}