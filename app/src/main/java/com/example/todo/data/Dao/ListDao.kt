package com.example.todo.data.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.todo.data.model.TodoLists
import kotlinx.coroutines.flow.Flow

@Dao
interface ListDao {
    @Query("SELECT * FROM LISTS_TABLE")
    fun getAllLists() : Flow<List<TodoLists>>

    @Query("SELECT * FROM LISTS_TABLE WHERE id = :listId")
    fun getListById(listId :Long) : Flow<TodoLists>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertList(taskList : TodoLists)

    @Update
    suspend fun updateList(taskList: TodoLists)

    @Delete
    suspend fun deleteList(taskList: TodoLists)


}