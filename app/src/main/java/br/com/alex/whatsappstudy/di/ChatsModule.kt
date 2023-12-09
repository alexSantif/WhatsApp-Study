package br.com.alex.whatsappstudy.di

import br.com.alex.whatsappstudy.data.api.NewsApi
import br.com.alex.whatsappstudy.data.repository.ChatsRepository
import br.com.alex.whatsappstudy.data.repository.ChatsRepositoryImpl
import br.com.alex.whatsappstudy.domain.ChatsUseCase
import br.com.alex.whatsappstudy.presentation.chat.ChatViewModel
import br.com.alex.whatsappstudy.presentation.chatlist.ChatListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit

object ChatsModule {

    val instance = module {

        viewModel {
            ChatViewModel(get())
        }

        viewModel {
            ChatListViewModel(get())
        }

        factory {
            ChatsUseCase(get())
        }

        factory<ChatsRepository> {
            ChatsRepositoryImpl(get())
        }

        fun providesApi(retrofit: Retrofit): NewsApi {
            return retrofit.create(NewsApi::class.java)
        }
        factory { providesApi(get()) }
    }
}