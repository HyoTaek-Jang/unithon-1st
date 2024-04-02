package com.unithon.test.deploy.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {
    val data = mutableListOf<String>()

    @GetMapping
    fun getTest(): String {
        return "Hello, World!"
    }

    @PostMapping("/add")
    fun addData(data: String) {
        this.data.add(data)
    }

    @GetMapping("/list")
    fun listData(): List<String> {
        return this.data
    }

    @GetMapping("/clear")
    fun clearData() {
        this.data.clear()
    }
}