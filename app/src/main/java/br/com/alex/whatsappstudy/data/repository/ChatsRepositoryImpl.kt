package br.com.alex.whatsappstudy.data.repository

import br.com.alex.whatsappstudy.data.api.AppResult
import br.com.alex.whatsappstudy.data.api.NewsApi
import br.com.alex.whatsappstudy.data.model.ChatsResponse
import com.google.gson.Gson

class ChatsRepositoryImpl(private val api: NewsApi) : ChatsRepository {

    override suspend fun getNews(): AppResult<ChatsResponse?> {
//        return try {
//            val response = api.getNews("us", "126c1e71e05c42f9861a3da85a29c75b")
//            if (response.isSuccessful) {
//                AppResult.Success(response.body())
//            } else {
//                AppResult.Error(Exception(response.message()))
//            }
//        } catch (e: Exception) {
//            AppResult.Error(e)
//        }
        return AppResult.Success(getNewsMock())
    }

    private fun getNewsMock(): ChatsResponse {
        val jsonString = """{
   "totalResults":38,
   "chats":[
      {
         "author":"Test 1",
         "urlToImage":"https://cdn.cnn.com/cnnnext/dam/assets/231117195046-07-palestine-protest-11172023-ny-super-tease.jpg",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 2",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 3",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 4",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 5",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 6",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 7",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 8",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 9",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      },
      {
         "author":"Test 10",
         "urlToImage":"https://i.abcnewsfe.com/a/ef1d735b-9c8a-4993-911b-b19d8d4aee71/wirestory_f31f57a856f006ff0f2fc4984acaca6b_16x9.jpg?w=992",
         "messages":[
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            },
            {
                "text":"THE HAGUE, Netherlands -- The far-right, anti-Islam populist Geert Wilders was headed for a massive parliamentary election victory Wednesday in one of the",
                "publishedAt":"2023-11-22T23:42:47Z"
            }
         ]
      }
   ]
}"""
        return Gson().fromJson(jsonString, ChatsResponse::class.java)
    }
}