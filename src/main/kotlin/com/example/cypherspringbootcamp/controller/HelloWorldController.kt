package com.example.cypherspringbootcamp.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloWorldController {
    @RequestMapping("/hello")
    fun greeting(
        @RequestParam(value = "name", defaultValue = "name") name: String?
    ) = "{\"message\":\"Hello, $name\"}"
}