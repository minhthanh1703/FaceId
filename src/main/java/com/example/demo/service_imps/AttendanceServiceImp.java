package com.example.demo.service_imps;

import com.example.demo.dtos.InfoStudentResponseDTO;
import com.example.demo.entities.Attendance;
import com.example.demo.entities.Student;

import com.example.demo.mapper.AttendanceMapper;
import com.example.demo.repository.AttendanceRepository;
import com.example.demo.repository.StudentCourseRepository;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.AttendanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import util.Constants;
import util.DateUtil;

import java.util.Date;
import java.util.HashMap;

import java.util.Map;

@Service
public class AttendanceServiceImp implements AttendanceService {

    @Autowired
    AttendanceRepository attendanceRepository;

    @Autowired
    StudentCourseRepository studentCourseRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AttendanceMapper attendanceMapper;


    public InfoStudentResponseDTO checkAttendance(String personId) throws Exception {

        boolean checkAttendance = false;
        Student student = studentRepository.findById(personId).orElse(null);
        if (student == null) {
            throw new Exception("Student not found");
        }

        Date currentDateTime = DateUtil.getCurrentDate();

        Map parameter = new HashMap();
        parameter.put("currentDate", currentDateTime);
        parameter.put("studentId", student.getStudentId());

        InfoStudentResponseDTO infoAttendance = attendanceMapper.findInfoAttendance(parameter);
        if(infoAttendance == null){
            throw new Exception("InfoStudentResponseDTO is null");
        }

        if(infoAttendance.getCurrentStatus() != null && infoAttendance.getCurrentStatus().equals(Constants.NOTYET)){
            infoAttendance.setCurrentStatus(Constants.PRESENT);
            checkAttendance(infoAttendance.getCurrentAttendanceId());
        }


        boolean birthday = false;
        birthday = DateUtil.matchBirthday(currentDateTime, infoAttendance.getDob());
        if(birthday){
            infoAttendance.setMessage("Chúc mừng sinh nhật " +infoAttendance.getFullname());
        }else{
            infoAttendance.setMessage("Càng ngày càng tiến bộ nhé " +infoAttendance.getFullname());
        }

        if(infoAttendance.getNextCourseName() == null){
            infoAttendance.setMessage(infoAttendance.getMessage() + " Bạn đã hết tiết học trên hệ thống!!!");
        }

        return infoAttendance;
    }

    private void checkAttendance(int id) throws Exception{
        Attendance attendance = attendanceRepository.findById(id).orElse(null);
        if(attendance == null){
            throw new Exception("Attendance is null");
        }
        attendance.setStatus(Constants.PRESENT);
        attendanceRepository.save(attendance);
    }


}
