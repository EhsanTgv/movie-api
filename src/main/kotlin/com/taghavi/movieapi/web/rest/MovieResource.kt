package com.taghavi.movieapi.web.rest

import com.taghavi.movieapi.dto.MovieDTO
import com.taghavi.movieapi.entity.Movie
import com.taghavi.movieapi.service.MovieService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieResource(
    private val movieService: MovieService
) {

    @PostMapping
    fun createMovie(@RequestBody movieDTO: MovieDTO): ResponseEntity<MovieDTO> {
        return ResponseEntity(movieService.createMovie(movieDTO), HttpStatus.CREATED)
    }

    @GetMapping
    fun getMovies(): ResponseEntity<List<MovieDTO>> = ResponseEntity.ok(movieService.getMovies())

    @GetMapping("/{id}")
    fun getMovie(@PathVariable id: Int) = ResponseEntity.ok(movieService.getMovie(id))
}