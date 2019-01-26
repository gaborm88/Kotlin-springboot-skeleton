package com.mg.controller

import com.mg.dal.UserRepository
import com.mg.dal.model.User
import com.mg.public.dto.UserDto
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller

@Controller
class UserController(private val repository: UserRepository) : BaseController() {

    private var logger = LoggerFactory.getLogger(UserController::class.java)

    fun findAll() = repository.findAll().map(::convertToDto)

    fun findById(id: Long) = repository.findById(id).map(::convertToDto)

    fun deleteById(id: Long) = repository.deleteById(id)

    fun create(userDto: UserDto) =
            convertToDto(repository.save(convertToEntity(userDto)))

    private fun convertToDto(entity: User) =
            genericConverter(entity, UserDto::class.java)

    private fun convertToEntity(dto: UserDto) =
            genericConverter(dto, User::class.java)
}
