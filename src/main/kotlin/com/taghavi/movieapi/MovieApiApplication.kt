package com.taghavi.movieapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class MovieApiApplication{

	@GetMapping
	fun helloWorld()="Hello World! From Spring"
}

fun main(args: Array<String>) {
	runApplication<MovieApiApplication>(*args)
}
