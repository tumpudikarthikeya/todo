package com.example.todo.repositories

import androidx.room.Query
import androidx.room.Update
import com.example.todo.data.Dao.TaskDao
import com.example.todo.data.model.TodoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class TaskRepository @Inject constructor(private  val taskDao : TaskDao) {

    val getStaredTasks :Flow<List<TodoTask>> = taskDao.getStaredTasks()

    fun getTaskById(taskId : Long) : Flow<TodoTask> {
        return taskDao.getTaskById(taskId)
    }

    fun getAllTasks(listId : Long) : Flow<List<TodoTask>> {
        return taskDao.getAllTasks(listId)
    }

    suspend fun insertTask(task: TodoTask) {
         taskDao.insertTask(task)
    }

    suspend fun updateTask(task: TodoTask) {
         taskDao.updateTask(task)
    }

    suspend fun deleteTask(todoTask: TodoTask) {
         taskDao.deleteTask(todoTask)
    }

    suspend fun deleteCompletedTasks(listId: Long) {
         taskDao.deleteCompletedTasks(listId = listId)
    }

    fun sortByDateNew(listId: Long) {
         taskDao.sortByDateNew(listId)
    }

    fun sortByDateOld(listId: Long) {
         taskDao.sortByDateOld(listId)
    }
}
