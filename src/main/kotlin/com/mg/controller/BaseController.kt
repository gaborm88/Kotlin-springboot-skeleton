package com.mg.controller

import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
abstract class BaseController {

    @Autowired
    lateinit var modelMapper: ModelMapper

    fun <T, K> genericConverter(obj: T, targetClass: Class<K>) = modelMapper.map(obj, targetClass)

}
