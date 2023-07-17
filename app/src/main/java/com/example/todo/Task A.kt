// TaskAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckedTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.todo.R
import com.example.todo.Task

class TaskAdapter(private val taskList: MutableList<Task>) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val checkedTextViewTask: CheckedTextView = itemView.findViewById(R.id.checkedTextViewTask)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_task, parent, false)
        return TaskViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        val task = taskList[position]
        holder.checkedTextViewTask.text = task.name
        holder.checkedTextViewTask.isChecked = task.isCompleted
        holder.checkedTextViewTask.setOnClickListener {
            task.isCompleted = !task.isCompleted
            holder.checkedTextViewTask.isChecked = task.isCompleted
        }
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}
