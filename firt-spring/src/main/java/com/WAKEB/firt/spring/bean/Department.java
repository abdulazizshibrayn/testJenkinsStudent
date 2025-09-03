package com.WAKEB.firt.spring.bean;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data


@Entity
@Table(name = "dept")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dept_id")
    private Integer deptId;

    @Column(name = "dept_name", nullable = false, length = 20)
    private String deptName;

    @OneToMany(mappedBy = "deptId")
    private List<Employee> employees;
}
