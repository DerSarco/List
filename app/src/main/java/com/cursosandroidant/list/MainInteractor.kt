package com.cursosandroidant.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.concurrent.thread

/****
 * Project: List
 * From: com.cursosandroidant.list
 * Created by Alain Nicolás Tello on 30/09/21 at 11:28
 * All rights reserved 2021.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * Web: www.alainnicolastello.com
 ***/
class MainInteractor {
//    val items: LiveData<MutableList<ItemEntity>> = ListApplication.database.itemDao().getAllItems()

    val items : LiveData<MutableList<ItemEntity>> = liveData {
        val itemsLIveData = ListApplication.database.itemDao().getAllItems()
        emitSource(itemsLIveData)
    }
    suspend fun addItem(itemEntity: ItemEntity) = withContext(Dispatchers.IO){
        try {
            ListApplication.database.itemDao().addItem(itemEntity)
        } catch (e: Exception) {
            throw Exception("Error al insertar.")
        }
    }

    suspend fun updateItem(itemEntity: ItemEntity) = withContext(Dispatchers.IO){
        try {
            val result = ListApplication.database.itemDao().updateItem(itemEntity)
            if (result == 0) throw Exception("Error al actualizar.")
        } catch (e: Exception) {
            throw Exception("Error grave al actualizar.")
        }
    }
}