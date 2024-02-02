package com.example.dependencyinjection.Student

import android.util.Log
import javax.inject.Inject

class StudentEducationDetail @Inject constructor() {
    fun getStudentEducationDetail(){
        Log.e("main","student education detail")
    }

}