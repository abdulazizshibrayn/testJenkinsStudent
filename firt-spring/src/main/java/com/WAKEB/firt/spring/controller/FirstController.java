package com.WAKEB.firt.spring.controller;

import com.WAKEB.firt.spring.bean.Student;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {



    @GetMapping("/greet")
    public String greeting() {
        return "Hello World Spring Boot!";
    }

    @GetMapping("/st1")
    public Student getStudent() {
        Student st1 = new Student(2,"Aziz" , "Riyadh");
        return st1;
    }

    @GetMapping(path = "/st2", produces = MediaType.APPLICATION_XML_VALUE)
    public Student getStudent2(){
        Student st2 = new Student(5,"Ibrahim" , "Jed");
        return st2;
    }



}
