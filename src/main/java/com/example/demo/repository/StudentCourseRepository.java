package com.example.demo.repository;

import com.example.demo.entities.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {

    List<StudentCourse> findByPersonIdAndDisable(String personId, boolean disable);
}
