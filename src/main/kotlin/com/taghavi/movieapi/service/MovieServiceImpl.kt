package com.taghavi.movieapi.service

import com.taghavi.movieapi.dto.MovieDTO
import com.taghavi.movieapi.repository.MovieRepository
import com.taghavi.movieapi.utils.mapper.MovieMapper
import org.springframework.stereotype.Service

@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper,
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO): MovieDTO {
        if (movieDTO.id != -1) {
            throw IllegalArgumentException("Id must be null or -1.")
        }
        val movie = movieMapper.toEntity(movieDTO)
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }
}