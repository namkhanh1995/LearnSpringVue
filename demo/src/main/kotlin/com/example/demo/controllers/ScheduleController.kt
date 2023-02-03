package com.example.demo.controllers

import com.example.demo.models.Schedule
import com.example.demo.services.ScheduleService
import org.springframework.web.bind.annotation.*

@CrossOrigin(origins = ["http://localhost:3000/"], maxAge = 3600)
@RestController
@RequestMapping("/api")
class ScheduleController (private val scheduleService: ScheduleService){
    @GetMapping("/schedule")
    fun getAllUsers(): List<Schedule> {
        return scheduleService!!.getAllSchedule()
    }
    @PostMapping("/schedule")
    fun createUser(@RequestBody schedule: Schedule) {
        scheduleService!!.createSchedule(schedule)
    }
}