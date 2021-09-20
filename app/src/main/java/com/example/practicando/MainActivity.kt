package com.example.practicando

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recycler = findViewById<RecyclerView>(R.id.recycler)
        //lineal
        //val layoutManager = LinearLayoutManager(this)
        //recycler.layoutManager = layoutManager
        //Grid
        val layoutManager = GridLayoutManager(this,3)
        recycler.layoutManager = layoutManager
        recycler.adapter = MoviesAdapter(listOf(
            Movie("Spiderman 1","https://loremflickr.com/320/240?lock=1"),
            Movie("Spiderman 2","https://loremflickr.com/320/240?lock=2"),
            Movie("Spiderman 3","https://loremflickr.com/320/240?lock=3"),
            Movie("Spiderman 4","https://loremflickr.com/320/240?lock=4"),
            Movie("Spiderman 5","https://loremflickr.com/320/240?lock=5"),
            Movie("Spiderman 6","https://loremflickr.com/320/240?lock=6"),
            Movie("Spiderman 7","https://loremflickr.com/320/240?lock=7"),
            Movie("Spiderman 8","https://loremflickr.com/320/240?lock=8"),
            Movie("Spiderman 9","https://loremflickr.com/320/240?lock=9"),
        ))
        //val movie = findViewById<MovieView>(R.id.movie)
        //movie.setMovie(Movie("Spiderman","https://loremflickr.com/320/240"))

    }
}