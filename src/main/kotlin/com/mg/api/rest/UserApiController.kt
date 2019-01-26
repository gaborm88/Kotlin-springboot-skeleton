package com.mg.api.rest

import com.mg.controller.UserController
import com.mg.public.dto.UserDto
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/user")
class UserApiController(val controller: UserController) {

    private var logger = LoggerFactory.getLogger(UserApiController::class.java)

    @GetMapping("")
    @ResponseBody
    fun findAll() = controller.findAll()

    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = controller.findById(id)

    @DeleteMapping("{id}")
    fun deleteById(@PathVariable id: Long) = controller.deleteById(id)

    @PostMapping("")
    fun save(@RequestBody userDto: UserDto) = controller.create(userDto)
}
