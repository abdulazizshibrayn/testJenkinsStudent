package com.WAKEB.firt.spring.service;

import com.WAKEB.firt.spring.bean.Job;
import com.WAKEB.firt.spring.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> findAllJobs(){
        return  jobRepository.findAll();
    }

    public Optional<Job> findJobById(int id){
        return jobRepository.findById(id);
    }

    public Job createJob(Job job){
        return jobRepository.save(job);
    }

    public Job updateJob(Job job){
        return jobRepository.save(job);
    }

    public void deleteJobById(int id){
        jobRepository.deleteById(id);
    }



}
