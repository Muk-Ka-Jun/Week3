package com.example.practical3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.practical3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        var student:Student = Student("Ali", "RSD")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)

        binding.btnSetData.setOnClickListener(){
            //student.programme = "RSD"
            binding.myStudent = student

            //binding.tvName.text = "Ali"
            //binding.tvProgramme.text = "RSD"

        }

        binding.btnChangeValue.setOnClickListener(){
            student.programme = "RIT"
            binding.invalidateAll()
        }
    }
}