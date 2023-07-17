package com.example.todo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

  

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       
    }

    fun onAddButtonClick(view: View) {
        val editTextTask = null
        val taskName = editTextTask.text.toString().trim()
        if (taskName.isNotEmpty()) {
            val newTask = Task(taskName)
            val taskList = null
            taskList.addIfNotNull(newTask)
            val taskAdapter = null
            taskAdapter.notifyDataSetChanged()
            editTextTask.text.clear()
        }
    }
}



