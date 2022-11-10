package com.taghavi.movieapi.service

import com.taghavi.movieapi.dto.MovieDTO

interface MovieService {

    fun createMovie(movieDTO: MovieDTO): MovieDTO
}