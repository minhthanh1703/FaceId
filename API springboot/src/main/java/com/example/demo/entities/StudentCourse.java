package com.example.demo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "student_course_tbl")
public class StudentCourse {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "person_id")
    private String personId;

    @Column(name = "course_id")
    private int courseId;

    @Column(name = "disable")
    private boolean disable;

    public StudentCourse() {
    }

    public StudentCourse(int id, String personId, int courseId, boolean disable) {
        this.id = id;
        this.personId = personId;
        this.courseId = courseId;
        this.disable = disable;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public boolean isDisable() {
        return disable;
    }

    public void setDisable(boolean disable) {
        this.disable = disable;
    }
}
