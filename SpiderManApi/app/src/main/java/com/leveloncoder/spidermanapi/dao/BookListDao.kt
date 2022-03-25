package com.leveloncoder.spidermanapi.dao

import androidx.room.Dao
import androidx.room.Query
import com.leveloncoder.spidermanapi.data.BooksList

@Dao
interface BookListDao {
    @Query("SELECT * FROM bookList")
    fun getAll(): List<BooksList>

    @Query("SELECT * FROM bookList WHERE id IN (:BookList)")
    fun loadAllById(userIds: IntArray): List<BooksList>

    @Query("SELECT * FROM bookList WHERE bookName LIKE :book AND date LIKE :date LIMIT 1")
    fun findByName(first: String, last: String): BooksList
}