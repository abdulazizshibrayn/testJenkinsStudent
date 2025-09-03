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
@Table(name = "emp")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer empId;

    private String empName;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department deptId;

    @ManyToOne
    @JoinColumn(name = "job_id")
    private Job jobId;
}
