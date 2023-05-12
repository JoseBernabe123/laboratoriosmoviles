package com.example.laboratorio05.ui.movie

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.laboratorio05.R
import com.example.laboratorio05.data.model.MovieModel

class MovieViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView) {
    private var nameTextView : TextView = itemView.findViewById(R.id.tittle_text_view)
    private var calification : TextView = itemView.findViewById(R.id.text_view_calification)

    fun bind(movie: MovieModel){
        nameTextView.text = movie.name
        calification.text = movie.qualification
    }
}