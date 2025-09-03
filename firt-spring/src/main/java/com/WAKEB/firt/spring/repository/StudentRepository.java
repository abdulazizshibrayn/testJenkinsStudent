package com.WAKEB.firt.spring.repository;

import com.WAKEB.firt.spring.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    //List<Student> findByName(String name);

    //List<Student> findByNameAndCity(String name, String city);

   // @Query(value = "select * from student where st_name like 'A%'",nativeQuery = true)
   // List<Student> findByNameCustomQuery(String name);


}
