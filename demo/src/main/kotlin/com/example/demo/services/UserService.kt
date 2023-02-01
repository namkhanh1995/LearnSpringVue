package com.example.demo.services

import com.example.demo.mappers.UserRepository
import com.example.demo.models.User
import org.springframework.stereotype.Service

@Service
class UserService (
        private val userRepository: UserRepository? = null
){
    fun getAllUsers(): List<User> {
       return userRepository!!.findAll()
    }
    fun createUser(user : User) : Int?{
        return userRepository!!.insert(user)
    }

    fun getUser(id: Long?):User?{
        return userRepository!!.findById(id)
    }

    fun deleteUser(id:Long):Int?{
        return userRepository!!.deleteById(id)
    }
    fun updateUser(user:User):Int?{
        return userRepository!!.update(user)
    }
}