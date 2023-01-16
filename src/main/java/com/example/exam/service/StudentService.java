package com.example.exam.service;


import com.example.exam.entity.StudentEntity;
import com.example.exam.model.Student;
import com.example.exam.repository.RepoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class StudentService {
    @Autowired
    private RepoStudent repoStudent;

    @PostMapping("/getData")
    public String saveData(Student student) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setName(student.getName());
        //RollNumber validation
        if (validateRollNum(student.getRollNum())) {
            studentEntity.setRollNum(student.getRollNum());
        } else {
            return "Student roll Number is not proper, Please recheck!!";
        }
        //Email validation
        if (validateEmail(student.getEmail())) {
            studentEntity.setEmail(student.getEmail());
        } else {
            return "Student Email address is not correct!!";
        }
        if(validatePhoneNum(student.getPhoneNum())) {
            studentEntity.setPhoneNum(student.getPhoneNum());
        }else {
            return "phone number is incorrect";
        }
            studentEntity.setLocation(student.getLocation());
        if (validateScore(student.getScore())) {
            studentEntity.setScore(student.getScore());
        }else {
            return "Student are not allowed to enroll as the score below 60%";
        }
        if(validatePinCode(student.getPinCode())) {
            studentEntity.setPinCode(student.getPinCode());
        }else{
            return  "Pin code is incorrect";
        }

        studentEntity.setDob(student.getDob());
        try {
            repoStudent.save(studentEntity);
        } catch (Exception e) {
            System.err.println("Error Details::" + e.getMessage());
        }
        return "Success";
    }

    private boolean validateRollNum(String rollNum) {
        if (rollNum != null && rollNum.length() == 10
                && ("ed").equalsIgnoreCase(rollNum.substring(rollNum.length() - 2))) {
            return true;
        } else return false;
    }

    private boolean validateEmail(String email) {
        if (email != null && email.endsWith("@zorbasofted.edu.com") && email.contains("@")) {
            return true;
        } else {
            return false;
        }
    }
    private boolean validatePhoneNum(String phoneNum){
        if(phoneNum.length() == 10) {
            return true;
        }else{
            return false;
        }
}
    private boolean validateScore(int score) {
        if (score > 60) {
        return true;
    } else {
        return false;
    }
}
    private boolean validatePinCode(String pinCode) {
        if (pinCode.length() == 6) {
            return true;
        } else {
            return false;
        }
    }

}