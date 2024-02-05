package com.example.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.dependencyinjection.Student.StudentProfile
import com.example.dependencyinjection.ViewModel.StudentDataViewModel
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
   val studentDataViewModel:StudentDataViewModel by viewModels()
    /*@Inject
     lateinit var studentProfile: StudentProfile

     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // studentProfile.getStudentProfile()
      studentDataViewModel.response.observe(this, Observer {response->
          Log.d("name", response[0].name)
      })

    }
}