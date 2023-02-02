package com.example.demo.controllers

import com.example.demo.models.User
import com.example.demo.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
@CrossOrigin(origins = ["http://localhost:3000/"], maxAge = 3600)
@RestController
@RequestMapping("/api")
class Users (
        private val userService: UserService? = null
){
    @GetMapping("/users")
    fun getAllUsers(): List<User> {
       return userService!!.getAllUsers()
    }
    @PostMapping("/users")
    fun createUser(@RequestBody user:User): User? {
        var id = userService!!.createUser(user)
        return userService.getUser(user.id)
    }

    @GetMapping("/users/{id}")
    fun getUserById(@PathVariable id: Long?): ResponseEntity<User> {
        val user = userService!!.getUser(id)
        return ResponseEntity.ok(user)
    }
    @DeleteMapping("/users/{id}")
    fun deleteUser(@PathVariable id: Long?) {
        userService!!.deleteUser(id)
    }

}