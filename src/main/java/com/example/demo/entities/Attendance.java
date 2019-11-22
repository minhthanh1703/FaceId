package com.example.demo.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "attendance_tbl")
public class Attendance {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    private String status;

    @Column(name = "slot")
    private int slotNumber;

    @Column(name = "student_course_id")
    private int studentCourseId;

    @Column(name = "date_time_begin")
    private Date timeBegin;

    @Column(name = "date_time_end")
    private Date timeEnd;

    @Column(name = "room")
    private int room;

    @Column(name = "student_id")
    private String studentId;

    @Column(name = "course_name")
    private String courseName;


    public Attendance() {
    }

    public Attendance(int id, String status, int slotNumber, int studentCourseId, Date timeBegin, Date timeEnd, int room, String studentId, String courseName) {
        this.id = id;
        this.status = status;
        this.slotNumber = slotNumber;
        this.studentCourseId = studentCourseId;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.room = room;
        this.studentId = studentId;
        this.courseName = courseName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Date getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Date timeBegin) {
        this.timeBegin = timeBegin;
    }

    public Date getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public int getStudentCourseId() {
        return studentCourseId;
    }

    public void setStudentCourseId(int studentCourseId) {
        this.studentCourseId = studentCourseId;
    }



    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
