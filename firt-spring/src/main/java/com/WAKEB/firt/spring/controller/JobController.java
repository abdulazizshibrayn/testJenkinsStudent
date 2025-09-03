package com.WAKEB.firt.spring.controller;


import com.WAKEB.firt.spring.bean.Department;
import com.WAKEB.firt.spring.bean.Job;
import com.WAKEB.firt.spring.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("/")
    public ResponseEntity<List<Job>> getAllJob(){
        return ResponseEntity.ok(jobService.findAllJobs());
    }

}
