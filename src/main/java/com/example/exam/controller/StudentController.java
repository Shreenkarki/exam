package com.example.exam.controller;

import com.example.exam.model.Student;
import com.example.exam.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/studentController")
public class StudentController {
   @Autowired
    private StudentService studentService;
  @PostMapping("getData")
    public String getData(@RequestBody Student student){
    this.studentService.saveData(student);
    return "Success !!!";
   }

}
