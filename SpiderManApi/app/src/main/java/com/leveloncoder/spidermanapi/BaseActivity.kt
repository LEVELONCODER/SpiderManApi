package com.leveloncoder.spidermanapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.SearchView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import com.leveloncoder.spidermanapi.data.BooksList

class BaseActivity: AppCompatActivity() {
    private lateinit var findBook: SearchView
    private lateinit var emptyText: TextView
    private lateinit var viewBooks: Button
    private lateinit var findBooks: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.favorite_book)

        findBook = findViewById(R.id.findBook)
        emptyText = findViewById(R.id.emptyText)
        viewBooks = findViewById(R.id.booksButton)
        findBooks = findViewById(R.id.favoriteButton)

        findBook.setQuery("Find Book", true)
        emptyText.isVisible

        viewBooks.setOnClickListener {
            setContentView(R.layout.favorite_book)
        }

        findBooks.setOnClickListener {
            setContentView(R.layout.find_books)
        }

        findBook.setOnClickListener {
            setContentView(R.layout.find_books)
        }

        val bookList: BooksList = BooksList(0, "test", "today")

        if(bookList == null) {
            Toast.makeText(this, "Book List Is Null!", Toast.LENGTH_SHORT).toString()
        } else {
           Log.d("Info", "all good")
        }
    }
}