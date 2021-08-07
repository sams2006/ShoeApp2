package com.example.shoeapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "shoe_table")
data class Shoe (

    @PrimaryKey(autoGenerate = true)
    var shoeId:Long = 0L ,

    @ColumnInfo(name = "Shoe_name")
    var name: String = "",

    @ColumnInfo(name = "size_number")
    var size: Double = 0.0 ,

    @ColumnInfo(name = "company_name")
    var company: String = "",

    @ColumnInfo(name = "describe_shoe")
    var description: String = ""
)
