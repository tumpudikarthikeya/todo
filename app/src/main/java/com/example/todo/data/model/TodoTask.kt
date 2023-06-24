package com.example.todo.data.model

import androidx.room.Delete
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.example.todo.util.Constants.TASKS_TABLE
import java.util.Date

@Entity(tableName = TASKS_TABLE , foreignKeys = [ForeignKey(entity = TodoLists::class ,
                                                            parentColumns = ["id"],
                                                            childColumns = ["listId"],
                                                            onDelete = ForeignKey.CASCADE)])
data class TodoTask (
    @PrimaryKey(autoGenerate = true)
    val id : Long =0,
    val listId : Long,
    val title : String ,
    val description : String,
    val isCompleted : Boolean = false,
    val stared : Boolean = false,
    val createdAt :Date = Date()
)