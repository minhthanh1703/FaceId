package com.example.demo.controllers;

import com.example.demo.dtos.ResponseDTO;
import com.example.demo.dtos.InfoStudentResponseDTO;
import com.example.demo.service_imps.AttendanceServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import util.Url;

@RestController
@RequestMapping(Url.API)
public class AttendanceController {
    @Autowired
    AttendanceServiceImp attendanceServiceImp;

    @GetMapping(Url.ATTENDANCE +"/{personId}")
    public ResponseEntity checkAttendance(@PathVariable String personId){
        ResponseDTO responseDTO = new ResponseDTO();
        try{
            InfoStudentResponseDTO dto = attendanceServiceImp.checkAttendance(personId);
            responseDTO.setData(dto);
            responseDTO.setStatusCode(ResponseDTO.StatusCode.SUCCESS);
            return new ResponseEntity(responseDTO, HttpStatus.OK);
        }catch (Exception ex){
            ex.printStackTrace();
            responseDTO.setMessage(ex.getMessage());
            responseDTO.setStatusCode(ResponseDTO.StatusCode.FAILE);
            return new ResponseEntity(responseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
