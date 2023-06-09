package com.example.laboratorio05.ui.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.renderos.labo05.MovieRevieweAplication
import com.renderos.labo05.data.models.MovieModel
import com.renderos.labo05.repository.MovieRepository

class MovieViewModel(private val repository: MovieRepository): ViewModel() {
    fun getMovies() = repository.getMovies()
    fun addMovie(movie: MovieModel) = repository.addMovie(movie)


    companion object {
        val factory = viewModelFactory {
            initializer {
                val app = this[APPLICATION_KEY] as MovieRevieweAplication
                MovieViewModel(app.movieRepository)
            }
        }
    }
}