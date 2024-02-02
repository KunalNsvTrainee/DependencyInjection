package com.example.dependencyinjection.Student

import android.util.Log
import javax.inject.Inject

class StudentProfile @Inject constructor(private val studentEducationDetail: StudentEducationDetail,private val studentDetail: StudentDetail) {
    fun getStudentProfile(){
        studentEducationDetail.getStudentEducationDetail()
        studentDetail.getStudentdetail()
      Log.d("main","at profile")
    }
}