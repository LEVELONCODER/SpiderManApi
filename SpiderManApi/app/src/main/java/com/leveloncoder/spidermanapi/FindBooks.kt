package com.leveloncoder.spidermanapi

import android.os.Bundle
import android.widget.SearchView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.FragmentActivity
import androidx.room.Room
import com.leveloncoder.spidermanapi.data.AppDatabase
import com.leveloncoder.spidermanapi.data.BooksList

class FindBooks: FragmentActivity() {
    private lateinit var findBook: SearchView
    private lateinit var emptyText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.find_books)

        findBook = findViewById(R.id.findBook)
        emptyText = findViewById(R.id.emptyText)
        findBook.setQuery("Find Book", true)
        emptyText.isVisible

        val db = Room.databaseBuilder(
            this,
            AppDatabase::class.java,
            "bookListDataBase"
        )

        val spiderManOne: BooksList = BooksList(1, "spider-man", "01.05.2002")
        val spiderManTwo: BooksList = BooksList(2, "spider-man 2", "02.07.2004")
        val spiderManThree: BooksList = BooksList(3, "spider-man 3", "04.05.2007")
        val theAmazingSpiderMan: BooksList = BooksList(
            4,
            "The-Amazing-Spider-Man",
            "03.07.2012"
        )
        val theAmazingSpiderManTwo: BooksList = BooksList(
            5,
            "The-Amazing-Spider-Man-2",
            "02.05.2014"
        )
        val spiderManHomeComing: BooksList = BooksList(
            6,
            "Spider-Man-HomeComing",
            "06.07.2017"
        )
        val spiderManFarFromHome: BooksList = BooksList(
            7,
            "Spider-Man-Far-From-Home",
            "26.06.2019"
        )
        val spiderManNoWayHome: BooksList = BooksList(
            8,
            "Spider-Man-No-Way-Home",
            "17.12.2021"
        )
    }
}