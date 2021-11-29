package com.cursosandroidant.list

import android.app.Application
import androidx.room.Room

/****
 * Project: List
 * From: com.cursosandroidant.list
 * Created by Alain Nicolás Tello on 01/10/21 at 9:02
 * All rights reserved 2021.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * Web: www.alainnicolastello.com
 ***/
class ListApplication : Application() {
    companion object{
        lateinit var database: ListDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(this,
            ListDatabase::class.java,
            "ListDatabase")
            .build()
    }
}