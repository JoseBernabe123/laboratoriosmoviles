package com.renderos.labo05.repository

import com.renderos.labo05.data.models.MovieModel


class MovieRepository (private val movies: MutableList<MovieModel>){
    fun getMovies() = movies

    fun addMovie(newMovie: MovieModel) = movies.add(newMovie)
}