package com.example.todo.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.todo.util.Constants.LISTS_TABLE


@Entity(tableName = LISTS_TABLE)
data class TodoLists (
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0,
    val title : String,
    val description : String
        )