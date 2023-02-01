package com.example.demo.controllers

import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Users (
        private val userService: UserService
){
    @GetMapping("/users")
    fun getAllUsers(): List<User> {
       return userService.getAllUsers()
    }
    @PostMapping("/users")
    fun createUser(@RequestBody user:User): User? {
        var id = userService.createUser(user)
        return userService.getUser(user.id)
    }




}