package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "student_tbl")
public class Student {
    @Id
    @Column(name = "person_id")
    private String personId;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "sex")
    private String sex;

    @Column(name = "student_id")
    private String studentId;

    public Student() {
    }

    public Student(String personId, String fullname, Date dob, String sex, String studentId) {
        this.personId = personId;
        this.fullname = fullname;
        this.dob = dob;
        this.sex = sex;
        this.studentId = studentId;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
