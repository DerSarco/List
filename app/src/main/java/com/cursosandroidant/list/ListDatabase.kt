package com.cursosandroidant.list

import androidx.room.Database
import androidx.room.RoomDatabase

/****
 * Project: List
 * From: com.cursosandroidant.list
 * Created by Alain Nicolás Tello on 01/10/21 at 9:07
 * All rights reserved 2021.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * Web: www.alainnicolastello.com
 ***/
@Database(entities = [ItemEntity::class], version = 1)
abstract class ListDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}