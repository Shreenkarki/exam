package com.example.exam.entity;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name= "student_information")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name= "name")
    private String Name;
    @Column(name= "rollNum")
    private String rollNum;
    @Column(name= "email")
    private String email;
    @Column(name="phoneNum")
    private String phoneNum;
    @Column(name="location")
    private String location;
    @Column(name="score")
    private int score;
    @Column(name="pinCode")
    private String pinCode;
    @Column(name="dob")
    private Date dob;
}
