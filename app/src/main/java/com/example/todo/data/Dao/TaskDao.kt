package com.example.todo.data.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.todo.data.model.TodoLists
import com.example.todo.data.model.TodoTask
import kotlinx.coroutines.flow.Flow


@Dao
interface TaskDao {
    @Query("SELECT * FROM TASKS_TABLE WHERE listId = :listId")
    fun getAllTasks(listId : Long) : Flow<List<TodoTask>>

    @Query("SELECT * FROM TASKS_TABLE WHERE id = :taskId")
    fun getTaskById(taskId :Long) : Flow<TodoTask>

    @Query("SELECT * FROM TASKS_TABLE WHERE stared = 1")
    fun getStaredTasks() : Flow<List<TodoTask>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TodoTask)

    @Update
    suspend fun updateTask(task: TodoTask)

    @Delete
    suspend fun deleteTask(todoTask: TodoTask)

    @Query("DELETE  FROM TASKS_TABLE where listId = :listId and isCompleted = 1 ")
    suspend fun deleteCompletedTasks(listId: Long)

    @Query("SELECT * FROM  TASKS_TABLE WHERE listId = :listId ORDER BY createdAt Desc")
    fun sortByDateNew(listId: Long)

    @Query("SELECT * FROM  TASKS_TABLE WHERE listId = :listId ORDER BY createdAt Asc")
    fun sortByDateOld(listId: Long)
}