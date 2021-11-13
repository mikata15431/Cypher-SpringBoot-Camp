package com.example.cypherspringbootcamp.controller

import com.example.cypherspringbootcamp.domain.HelloWorld
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
private class HelloWorldController {
    @RequestMapping("/hello")
    fun greeting(
        @RequestParam(value = "name", defaultValue = "name") name: String
    ) = HelloWorld("Hello, $name")
}