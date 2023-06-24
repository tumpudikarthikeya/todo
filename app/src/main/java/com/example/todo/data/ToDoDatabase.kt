package com.example.todo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todo.data.Dao.ListDao
import com.example.todo.data.Dao.TaskDao
import com.example.todo.data.model.TodoLists
import com.example.todo.data.model.TodoTask


@Database(entities = [TodoLists::class , TodoTask::class ], version = 1 , exportSchema = false)
abstract class ToDoDatabase : RoomDatabase() {
    abstract fun todoListsDao(): ListDao
    abstract fun todoTaskDao(): TaskDao
}