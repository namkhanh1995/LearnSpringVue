package com.example.demo.services

import com.example.demo.mappers.ScheduleRepository
import com.example.demo.models.Schedule
import org.springframework.stereotype.Service

@Service
class ScheduleService (private val scheduleRepository: ScheduleRepository? = null,val offset: Int = 7){
    fun getAllSchedule(): List<Schedule> {
        //MutableList(Schedule) lstSchedule = scheduleRepository!!.findAll();
        //List<Schedule>() lstSchedule = scheduleRepository!!.findAll();
       // schedule.firstTimestamp = schedule.firstTimestamp + (3600000*offset)
        //return lstSchedule
        var schedules = scheduleRepository!!.findAll()

        for(schedule in schedules){
            schedule.firstTimestamp = schedule.firstTimestamp + (3600000*offset)
            schedule.secondTimestamp = schedule.secondTimestamp + (3600000*offset)
        }
        return schedules
    }
    fun createSchedule(schedule : Schedule) {
        return scheduleRepository!!.insert(schedule)
    }
}