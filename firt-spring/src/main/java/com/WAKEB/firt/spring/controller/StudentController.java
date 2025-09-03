package com.WAKEB.firt.spring.controller;

import com.WAKEB.firt.spring.bean.Student;
import com.WAKEB.firt.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping( "/")
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());

    }
    @GetMapping("/{s_id}")
    public  ResponseEntity <Student>  getStudentById(@PathVariable("s_id") int id) throws Exception{
        Optional<Student> student = studentService.getStudentById(id);

        Student st = student.orElseThrow(()->new Exception("Student Not Found"));
        return ResponseEntity.ok(st);
    }

    @PostMapping("/")
    public ResponseEntity <Student> createStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @PutMapping("/")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student){
        return ResponseEntity.ok(studentService.updateStudent(student));
   }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
    }

    //public List <Student> findByNameAndCity (String name, String city){
       // return  studentService.findByNameAndCity(name,city);
   // }


}
