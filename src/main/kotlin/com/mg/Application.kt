package com.mg

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
@EnableAutoConfiguration
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
