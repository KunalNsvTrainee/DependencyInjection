package com.example.dependencyinjection.Retrofit

import com.example.dependencyinjection.Model.StudentModel
import retrofit2.http.GET

interface StudentDataApiService {
    @GET("Demos/json-dummy-data/64KB.json")
    suspend fun getStudentData() : List<StudentModel>

}