class MainActivity : AppCompatActivity() {

    // ... (other code)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ... (other code)

        listViewTasks.onItemClickListener = AdapterView.OnItemClickListener { _, view, position, _ ->
            val task = taskList[position]
            taskList.removeAt(position)
            adapter.notifyDataSetChanged()
            Toast.makeText(this, "Completed: $task", Toast.LENGTH_SHORT).show()
        }

        // Add checkbox listener to mark tasks as done
        listViewTasks.setOnCheckedChangeListener { _, position, isChecked ->
            val task = taskList[position]
            if (isChecked) {
                taskList[position] = "✓ $task"
            } else {
                taskList[position] = task.removePrefix("✓ ")
            }
            adapter.notifyDataSetChanged()
        }
    }
}
