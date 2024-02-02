package com.example.dependencyinjection.Retrofit

import com.example.dependencyinjection.Model.StudentModel
import javax.inject.Inject

class StudentDataApiImpl @Inject constructor(private val studentDataApiService: StudentDataApiService) {
    suspend fun getData(): List<StudentModel> = studentDataApiService.getStudentData()
}