package com.example.cypherspringbootcamp.controller

import com.example.cypherspringbootcamp.domain.ExceptionResponse
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.servlet.NoHandlerFoundException


@RestControllerAdvice
class MyControllerAdvice {
    @ExceptionHandler(NoHandlerFoundException::class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    fun notFoundError(): ExceptionResponse =
        ExceptionResponse("no handler found")

    @ExceptionHandler(Exception::class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    fun applicationError(): ExceptionResponse =
        ExceptionResponse("something wrong ;-(")
}
