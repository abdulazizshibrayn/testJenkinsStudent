package com.WAKEB.firt.spring;



import com.WAKEB.firt.spring.bean.Student;
import com.WAKEB.firt.spring.controller.StudentController;
import com.WAKEB.firt.spring.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StudentControllerTest {

    @Test
    void getUserById() {}


    @Autowired
    StudentController studentController;

    @Autowired
    StudentService studentService;


    @Test
    public void testFindAll(){
        RestTemplate restTemplate = new RestTemplate();

        String url = "http://localhost:8080/student/";
        List<Student> students = restTemplate.getForObject(url, List.class);

        int size = students.size();

        assertTrue(size >0,"Error in student array list");

    }
}
