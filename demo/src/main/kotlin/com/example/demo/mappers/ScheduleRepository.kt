package com.example.demo.mappers

import com.example.demo.models.Schedule
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface ScheduleRepository {
    @Select("select * from schedules")
    fun findAll(): List<Schedule>

    @Insert(
        "INSERT INTO schedules(id, eventName, firstTimestamp, secondTimestamp) " +
                " VALUES ( #{id}, #{eventName}, #{firstTimestamp}, #{secondTimestamp})"
    )
    fun insert(schedule: Schedule?)
}