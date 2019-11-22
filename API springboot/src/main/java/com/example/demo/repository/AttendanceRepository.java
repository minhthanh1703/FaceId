package com.example.demo.repository;

import com.example.demo.entities.Attendance;
import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
    Attendance findByStudentCourseIdEqualsAndTimeBeginAfterAndTimeEndBefore(int id, DateTime start, DateTime end);
}
