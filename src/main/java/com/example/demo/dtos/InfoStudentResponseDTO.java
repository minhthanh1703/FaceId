package com.example.demo.dtos;

import java.util.Date;

public class InfoStudentResponseDTO {
    private String studentId;
    private String fullname;
    private Date dob;
    private int currentAttendanceId;
    private String currentCourseName;
    private String currentNote;
    private String currentStatus;
    private int currentSlot;
    private int currentRoom;
    private int absentNumber;
    private int nextAttendanceId;
    private String nextCourseName;
    private int nextSlot;
    private String nextNote;
    private int nextRoom;
    private String message;

    public InfoStudentResponseDTO() {
    }


    public InfoStudentResponseDTO(String studentId, String fullname, Date dob, int currentAttendanceId, String currentCourseName, String currentNote, String currentStatus, int currentSlot, int currentRoom, int absentNumber, int nextAttendanceId, String nextCourseName, int nextSlot, String nextNote, int nextRoom, String message) {
        this.studentId = studentId;
        this.fullname = fullname;
        this.dob = dob;
        this.currentAttendanceId = currentAttendanceId;
        this.currentCourseName = currentCourseName;
        this.currentNote = currentNote;
        this.currentStatus = currentStatus;
        this.currentSlot = currentSlot;
        this.currentRoom = currentRoom;
        this.absentNumber = absentNumber;
        this.nextAttendanceId = nextAttendanceId;
        this.nextCourseName = nextCourseName;
        this.nextSlot = nextSlot;
        this.nextNote = nextNote;
        this.nextRoom = nextRoom;
        this.message = message;
    }

    public int getAbsentNumber() {
        return absentNumber;
    }

    public void setAbsentNumber(int absentNumber) {
        this.absentNumber = absentNumber;
    }

    public int getCurrentAttendanceId() {
        return currentAttendanceId;
    }

    public void setCurrentAttendanceId(int currentAttendanceId) {
        this.currentAttendanceId = currentAttendanceId;
    }

    public int getNextAttendanceId() {
        return nextAttendanceId;
    }

    public void setNextAttendanceId(int nextAttendanceId) {
        this.nextAttendanceId = nextAttendanceId;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getCurrentCourseName() {
        return currentCourseName;
    }

    public void setCurrentCourseName(String currentCourseName) {
        this.currentCourseName = currentCourseName;
    }

    public String getCurrentNote() {
        return currentNote;
    }

    public void setCurrentNote(String currentNote) {
        this.currentNote = currentNote;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public int getCurrentSlot() {
        return currentSlot;
    }

    public void setCurrentSlot(int currentSlot) {
        this.currentSlot = currentSlot;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String getNextCourseName() {
        return nextCourseName;
    }

    public void setNextCourseName(String nextCourseName) {
        this.nextCourseName = nextCourseName;
    }

    public int getNextSlot() {
        return nextSlot;
    }

    public void setNextSlot(int nextSlot) {
        this.nextSlot = nextSlot;
    }

    public String getNextNote() {
        return nextNote;
    }

    public void setNextNote(String nextNote) {
        this.nextNote = nextNote;
    }

    public int getNextRoom() {
        return nextRoom;
    }

    public void setNextRoom(int nextRoom) {
        this.nextRoom = nextRoom;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
