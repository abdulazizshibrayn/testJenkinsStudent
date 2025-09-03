package com.WAKEB.firt.spring.repository;

import com.WAKEB.firt.spring.bean.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptRepository extends JpaRepository<Department,Integer> {
}