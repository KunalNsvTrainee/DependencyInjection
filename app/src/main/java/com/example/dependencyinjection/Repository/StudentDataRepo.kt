package com.example.dependencyinjection.Repository

import com.example.dependencyinjection.Model.StudentModel
import com.example.dependencyinjection.Retrofit.StudentDataApiImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class StudentDataRepo @Inject constructor(private val studentDataApiImpl: StudentDataApiImpl) {

    fun getStudentData() : Flow<List<StudentModel>> = flow {
        val response = studentDataApiImpl.getData()
        emit(response)
    }.flowOn(Dispatchers.IO)
}