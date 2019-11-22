package com.example.demo.mapper;

import com.example.demo.dtos.InfoStudentResponseDTO;
import com.example.demo.entities.Attendance;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface AttendanceMapper {

    Attendance findAttendanceByStudentCourseAndTime(Map parameter);

    InfoStudentResponseDTO findInfoAttendance(Map parameter);
}
