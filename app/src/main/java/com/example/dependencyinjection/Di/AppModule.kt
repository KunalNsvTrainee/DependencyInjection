package com.example.dependencyinjection.Di

import android.app.Application
import com.example.dependencyinjection.Retrofit.StudentDataApiImpl
import com.example.dependencyinjection.Retrofit.StudentDataApiService
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.internal.managers.ApplicationComponentManager
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponentManager::class)
class AppModule {

    @Provides
     fun providesBaseUrl():String = "https://microsoftedge.github.io/"

    @Provides
    @Singleton
    fun providesRetrofitBuilder(baseurl:String):Retrofit =
        Retrofit.Builder().baseUrl(baseurl).addConverterFactory(GsonConverterFactory.create()).build()

    @Provides
    @Singleton
    fun providesStudentDataApiService(retrofit: Retrofit):StudentDataApiService=
        retrofit.create(StudentDataApiService::class.java)
}