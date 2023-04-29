package com.renderos.labo05

import android.app.Application
import com.renderos.labo05.data.movies
import com.renderos.labo05.repository.MovieRepository

class MovieRevieweAplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}