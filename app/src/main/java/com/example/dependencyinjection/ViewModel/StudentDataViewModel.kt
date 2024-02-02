package com.example.dependencyinjection.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.dependencyinjection.Model.StudentModel
import com.example.dependencyinjection.Repository.StudentDataRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class StudentDataViewModel @Inject constructor(private val studentDataRepo: StudentDataRepo):ViewModel(){

    val response:LiveData<List<StudentModel>> = studentDataRepo.getStudentData()
        
}