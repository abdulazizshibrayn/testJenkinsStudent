package com.WAKEB.firt.spring.repository;

import com.WAKEB.firt.spring.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {


}
