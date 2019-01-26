package com.mg.api.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PingApiController {

    @GetMapping("/ping")
    fun ping() = "pong"
}
