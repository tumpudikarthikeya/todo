package com.example.todo.repositories

import com.example.todo.data.Dao.ListDao
import com.example.todo.data.model.TodoLists
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ListRepository  @Inject constructor(private val listDao :ListDao) {

    val getAllLists : Flow<List<TodoLists>>  = listDao.getAllLists()

    fun getListById(listId :Long) : Flow<TodoLists> {
        return listDao.getListById(listId)
    }

    suspend fun insertList(taskList : TodoLists) {
        listDao.insertList(taskList)
    }

    suspend fun updateList(taskList: TodoLists) {
        listDao.updateList(taskList)
    }

    suspend fun deleteList(taskList: TodoLists) {
        listDao.deleteList(taskList)
    }

}