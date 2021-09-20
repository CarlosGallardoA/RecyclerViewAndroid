package com.example.practicando

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide

class MovieView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {
    private val cover: ImageView
    private  val title: TextView
    init {
        val view = LayoutInflater.from(context).inflate(R.layout.view_movie, this, true)
        cover = view.findViewById(R.id.cover)
        title = view.findViewById(R.id.title)
        orientation = VERTICAL
    }
    fun setMovie(movie: Movie){
        title.text = movie.title
        Glide.with(context).load(movie.cover).into(cover)
    }
}