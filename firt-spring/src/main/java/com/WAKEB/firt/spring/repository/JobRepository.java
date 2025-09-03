package com.WAKEB.firt.spring.repository;

import com.WAKEB.firt.spring.bean.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job,Integer> {

}
