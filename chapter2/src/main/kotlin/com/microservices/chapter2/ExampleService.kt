package com.microservices.chapter2

import org.springframework.beans.factory.annotation.Value

interface ServiceInterface {
    fun getHello(name: String): String
}

class ExampleService: ServiceInterface {
    @Value("\${service.message.text}")
    private lateinit var text: String
    override fun getHello(name: String) = "$text $name"
}