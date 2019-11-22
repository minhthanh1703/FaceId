package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_tbl")
public class Course {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "course_code")
    private String courseCode;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "number_slot")
    private int numberSlot;

    public Course() {
    }

    public Course(int id, String courseCode, String courseName, int numberSlot) {
        this.id = id;
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.numberSlot = numberSlot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getNumberSlot() {
        return numberSlot;
    }

    public void setNumberSlot(int numberSlot) {
        this.numberSlot = numberSlot;
    }
}
