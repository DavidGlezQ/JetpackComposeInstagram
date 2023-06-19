package com.davidglez.jetpackcomposeinstagram.core.di

import com.davidglez.jetpackcomposeinstagram.login.data.network.LoginClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by davidgonzalez on 19/06/23
 */
@Module
@InstallIn(SingletonComponent::class) //definimos el alcance
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://run.mocky.io/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideLoginClient(retrofit: Retrofit): LoginClient {
        return retrofit.create(LoginClient::class.java)
    }
}