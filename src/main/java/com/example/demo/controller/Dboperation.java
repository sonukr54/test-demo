package com.example.demo.controller;

import com.example.demo.entity.Students;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Dboperation {

    @Autowired
    StudentService studentService;


    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Students s) {
        studentService.saveStudent(s);
        return "student records saved!!";
    }


    @GetMapping("/getStudents")
    public List<Students> returnStudents() {
        return studentService.returnStudents();

    }

    @PutMapping("/deleteStudents")
    public String deleteStudents(@RequestBody Students s) {
        studentService.deleteStudents(s);
        return "deleted";
    }




}


