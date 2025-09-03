package com.WAKEB.firt.spring.controller;

import com.WAKEB.firt.spring.bean.Employee;
import com.WAKEB.firt.spring.service.EmpService;
import com.WAKEB.firt.spring.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {

    @Autowired
     private EmpService empService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getAllEmp(){
        return ResponseEntity.ok(empService.findAll());

    }
}
