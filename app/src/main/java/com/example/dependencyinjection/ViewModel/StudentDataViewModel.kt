package com.example.dependencyinjection.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.dependencyinjection.Model.StudentModel
import com.example.dependencyinjection.Repository.StudentDataRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import javax.inject.Inject
@HiltViewModel
class  StudentDataViewModel @Inject constructor(private val studentDataRepo: StudentDataRepo):ViewModel(){

    val response: LiveData<List<StudentModel>> = studentDataRepo.getStudentData()
        .catch {e->
            Log.d("Data","${e.message}")
    }.asLiveData()
        
}