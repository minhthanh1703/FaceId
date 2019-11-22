package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "note_tbl")
public class Note {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "attendance_id")
    private int attendance_id;

    @Column(name = "details")
    private String details;

    public Note(String id, int attendance_id, String details) {
        this.id = id;
        this.attendance_id = attendance_id;
        this.details = details;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(int attendance_id) {
        this.attendance_id = attendance_id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
