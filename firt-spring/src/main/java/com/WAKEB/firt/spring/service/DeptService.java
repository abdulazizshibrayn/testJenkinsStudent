package com.WAKEB.firt.spring.service;

import com.WAKEB.firt.spring.bean.Department;
import com.WAKEB.firt.spring.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DeptService {

    @Autowired
    private DeptRepository deptRepository;

    public List<Department> DeptAll(){
        return deptRepository.findAll();
    }

    public Optional<Department> DeptById(int id){
        return deptRepository.findById(id);
    }

    public Department createDept(Department dept){
        return deptRepository.save(dept);
    }

    public Department updateDept(Department dept){
        return deptRepository.save(dept);
    }

    public void deleteDeptById(int id){
        deptRepository.deleteById(id);
    }

}
