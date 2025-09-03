package com.WAKEB.firt.spring.service;


import com.WAKEB.firt.spring.bean.Employee;
import com.WAKEB.firt.spring.bean.Student;
import com.WAKEB.firt.spring.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    public EmpRepository empRepository;

    public List<Employee> findAll() {
        return empRepository.findAll();
    }
}
