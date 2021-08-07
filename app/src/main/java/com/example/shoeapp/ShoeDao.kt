package com.example.shoeapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ShoeDao {

    @Insert
    fun insert(shoe: Shoe)

    @Update
    fun update(shoe: Shoe)

    @Query("SELECT * FROM shoe_table WHERE shoeId = :key")
    fun get(key: Long) : Shoe

    @Query("DELETE FROM shoe_table")
    fun clear()

    @Query("SELECT * FROM shoe_table ORDER BY shoeId DESC")
    fun getAllShoes(): LiveData<List<Shoe>>

    @Query("SELECT * FROM shoe_table ORDER BY shoeId DESC LIMIT 1")
    fun getToShoe(): Shoe?
}