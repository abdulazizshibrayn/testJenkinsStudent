package com.WAKEB.firt.spring.service;

import com.WAKEB.firt.spring.bean.Student;
import com.WAKEB.firt.spring.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(int id){
        return studentRepository.findById(id);
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }
    public void deleteStudentById(int id){
        studentRepository.deleteById(id);
    }
    //public List<Student> findByName(String name){
    //    return studentRepository.findByName(name);
   // }

   // public List<Student> findByNameAndCity(String name, String city){
     //  return studentRepository.findByNameAndCity(name, city);
   // }


}
