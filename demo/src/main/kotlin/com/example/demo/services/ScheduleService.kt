package com.example.demo.services

import com.example.demo.mappers.ScheduleRepository
import com.example.demo.models.Schedule
import org.springframework.stereotype.Service

@Service
class ScheduleService (private val scheduleRepository: ScheduleRepository? = null){
    fun getAllSchedule(): List<Schedule> {
        return scheduleRepository!!.findAll()
    }
    fun createSchedule(schedule : Schedule) {
        return scheduleRepository!!.insert(schedule)
    }
}