package com.example.springbootmicro.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @RequestMapping(value = "/getschool")
    public String getSchoolName(){
        return "PSG Sarvajana";
    }
}
