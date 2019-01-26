package com.mg.api.rest

import com.mg.controller.AddressController
import com.mg.public.dto.AddressDto
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/address")
class AddressApiController(val controller: AddressController) {

    private var logger = LoggerFactory.getLogger(AddressApiController::class.java)

    @GetMapping("")
    @ResponseBody
    fun findAll() = controller.findAll()

    @GetMapping("{id}")
    @ResponseBody
    fun findById(@PathVariable id: Long) = controller.findById(id)

    @DeleteMapping("{id}")
    fun deleteById(@PathVariable id: Long) = controller.deleteById(id)

    @PostMapping("")
    fun save(@RequestBody accountDto: AddressDto) = controller.create(accountDto)
}
