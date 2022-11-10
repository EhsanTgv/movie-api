package com.taghavi.movieapi.repository

import com.taghavi.movieapi.dto.MovieDTO
import com.taghavi.movieapi.entity.Movie
import org.springframework.data.repository.CrudRepository

interface MovieRepository:CrudRepository<Movie,Int>