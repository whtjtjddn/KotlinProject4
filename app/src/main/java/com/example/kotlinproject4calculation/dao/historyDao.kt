package com.example.kotlinproject4calculation.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.kotlinproject4calculation.Model.historyModel

//룸에 연결되는 Dao
@Dao
interface historyDao{
    @Query("SELECT * FROM historyModel")
    fun getAll():List<historyModel>

    @Insert
    fun insertHistory(historyModel: historyModel)

    @Query("DELETE FROM historyModel")
    fun deleteAll()
}