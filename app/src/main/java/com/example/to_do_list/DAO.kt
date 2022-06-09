package com.example.to_do_list
import androidx.room.*

@Dao
interface DAO  {
    @Insert
     suspend fun  InsertTask(entity: Entity)

    @Update
     suspend fun updateTask(entity: Entity)

    @Delete
     suspend fun deleteTask(entity: Entity)

    @Query("Delete from to_do")
      suspend fun  deleteAll()

    @Query("Select * from to_do")
     suspend fun getTasks():List<Cardinfo>



    abstract fun insertTask(entity: Entity)


}