package com.leveloncoder.spidermanapi.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BooksList(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "bookName") val name: String,
    @ColumnInfo(name = "date") val date: String
)