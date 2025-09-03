package com.WAKEB.firt.spring.controller;


import com.WAKEB.firt.spring.bean.Department;
import com.WAKEB.firt.spring.repository.DeptRepository;
import com.WAKEB.firt.spring.service.DeptService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @GetMapping("/")
    public ResponseEntity<List<Department>> getAllDepartments(){
        return ResponseEntity.ok(deptService.DeptAll());
    }
}
