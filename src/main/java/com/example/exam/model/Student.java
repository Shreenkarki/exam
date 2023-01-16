package com.example.exam.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class Student {
    private  int id;
    private String Name;
    private String rollNum;
    private String email;
    private String phoneNum;
    private String location;
    private int score;
    private String pinCode;
    private Date dob;

}


