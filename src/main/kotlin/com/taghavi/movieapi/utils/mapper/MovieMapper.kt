package com.taghavi.movieapi.utils.mapper

import com.taghavi.movieapi.dto.MovieDTO
import com.taghavi.movieapi.entity.Movie
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class MovieMapper : Mapper<MovieDTO, Movie> {

    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating,
    )

    override fun toEntity(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating,
    )
}