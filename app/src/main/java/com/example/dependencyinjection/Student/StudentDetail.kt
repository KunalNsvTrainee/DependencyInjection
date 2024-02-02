package com.example.dependencyinjection.Student

import android.util.Log
import javax.inject.Inject

class StudentDetail @Inject constructor() {

    fun getStudentdetail(){
        Log.e("main","student detail")
    }

}