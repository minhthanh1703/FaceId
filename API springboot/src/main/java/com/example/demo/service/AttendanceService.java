package com.example.demo.service;

import com.example.demo.dtos.InfoStudentResponseDTO;

public interface AttendanceService {
    public InfoStudentResponseDTO checkAttendance(String personId)throws Exception;
}
