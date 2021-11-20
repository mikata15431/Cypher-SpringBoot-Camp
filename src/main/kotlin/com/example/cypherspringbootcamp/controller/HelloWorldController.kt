package com.example.cypherspringbootcamp.controller

import com.example.cypherspringbootcamp.domain.HelloWorld
import javax.validation.constraints.Size
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@Validated
@RestController
private class HelloWorldController {
    @RequestMapping("/hello")
    fun greeting(
        @RequestParam(value = "name") @Size(min = 3, max = 10) name: String
    ) = HelloWorld("Hello, $name")
}