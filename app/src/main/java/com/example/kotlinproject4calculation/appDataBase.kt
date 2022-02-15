package com.example.kotlinproject4calculation

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kotlinproject4calculation.Model.historyModel
import com.example.kotlinproject4calculation.dao.historyDao

@Database(entities = [historyModel::class], version = 1)
abstract class appDataBase : RoomDatabase(){
    abstract fun historyDao():historyDao
}