package com.cursosandroidant.list

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

/****
 * Project: List
 * From: com.cursosandroidant.list
 * Created by Alain Nicolás Tello on 01/10/21 at 9:06
 * All rights reserved 2021.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * Web: www.alainnicolastello.com
 ***/
@Dao
interface ItemDao {
    @Query("SELECT * FROM ItemEntity")
    fun getAllItems(): LiveData<MutableList<ItemEntity>>

    @Insert
    suspend fun addItem(itemEntity: ItemEntity): Long

    @Update
    suspend fun updateItem(itemEntity: ItemEntity): Int
}