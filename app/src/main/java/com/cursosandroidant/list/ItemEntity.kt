package com.cursosandroidant.list

import androidx.room.Entity
import androidx.room.PrimaryKey

/****
 * Project: List
 * From: com.cursosandroidant.list
 * Created by Alain Nicolás Tello on 30/09/21 at 12:11
 * All rights reserved 2021.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * Web: www.alainnicolastello.com
 ***/
@Entity(tableName = "ItemEntity")
data class ItemEntity(@PrimaryKey(autoGenerate = true) var id: Long = 0,
                      var text: String,
                      var isFavorite: Boolean = false)
