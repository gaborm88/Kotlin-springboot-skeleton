package com.mg.public.client

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Controller
import org.springframework.web.client.RestTemplate

@Controller
class UserRestClientController {

    @Autowired
    lateinit var restTemplate: RestTemplate

    @Value("url of the account")
    var accoundUrl = ""

    // fun getAllAccount() = restTemplate.getForObject(accoundUrl, AccountDto::class.java)

}