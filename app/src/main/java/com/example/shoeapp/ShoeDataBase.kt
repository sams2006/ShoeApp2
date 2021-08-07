package com.example.shoeapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Shoe::class] , version = 1 , exportSchema = false)
abstract class ShoeDataBase: RoomDatabase() {

    abstract val shoeDao: ShoeDao

    companion object {

        @Volatile
        private var INSTANCE: ShoeDataBase? = null


        fun getInstance(context: Context): ShoeDataBase {

            synchronized(this) {

                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ShoeDataBase::class.java,
                        "shoe_history"
                    )

                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }

                return instance
            }
        }
    }
}