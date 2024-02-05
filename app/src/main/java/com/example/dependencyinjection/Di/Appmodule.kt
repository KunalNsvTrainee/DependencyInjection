package com.example.dependencyinjection.Di

import com.example.dependencyinjection.Retrofit.StudentDataApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Appmodule {

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