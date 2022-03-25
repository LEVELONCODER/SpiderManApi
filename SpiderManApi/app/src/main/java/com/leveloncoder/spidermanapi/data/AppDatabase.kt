package com.leveloncoder.spidermanapi.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.leveloncoder.spidermanapi.dao.BookListDao

@Database(entities = [BooksList::class], version = 1)
abstract class AppDatabase: RoomDatabase() {
    abstract fun bookListDao(): BookListDao
}