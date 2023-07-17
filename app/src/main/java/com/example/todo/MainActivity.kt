package com.example.todo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // ...

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ...
    }

    fun onAddButtonClick(view: View) {
        val taskName = editTextTask.text.toString().trim()
        if (taskName.isNotEmpty()) {
            val newTask = Task(taskName)
            taskList.add(newTask)
            taskAdapter.notifyDataSetChanged()
            editTextTask.text.clear()
        }
    }
}
