package com.example.demo.mappers

import com.example.demo.models.User
import org.apache.ibatis.annotations.*

@Mapper
interface UserRepository {
    @Select("select * from users")
    fun findAll(): List<User>

    @Insert(
            "INSERT INTO users(id, firstName, lastName,emailId) " +
                    " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})"
    )
    fun insert(user: User?): Int
    @Select("SELECT * FROM users WHERE id = #{id}")
    fun findById(id: Long?): User?

    @Delete("DELETE FROM users WHERE id = #{id}")
    fun deleteById(id: Long): Int
    @Update(
            "Update users set firstName=#{firstName}, " +
                    " lastName=#{lastName}, emailId=#{emailId} where id=#{id}"
    )
    fun update(user: User?): Int
}