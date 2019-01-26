package com.mg.controller

import com.mg.dal.AddressRepository
import com.mg.dal.model.Address
import com.mg.public.dto.AddressDto
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Controller

@Controller
class AddressController(private val repository: AddressRepository) : BaseController() {

    private var logger = LoggerFactory.getLogger(AddressController::class.java)

    fun findAll() = repository.findAll().map(::convertToDto)

    fun findById(id: Long) = repository.findById(id).map(::convertToDto)

    fun deleteById(id: Long) = repository.deleteById(id)

    fun create(addressDto: AddressDto) = convertToDto(repository.save(convertToEntity(addressDto)))

    private fun convertToDto(entity: Address) = genericConverter(entity, AddressDto::class.java)

    private fun convertToEntity(dto: AddressDto) = genericConverter(dto, Address::class.java)
}
