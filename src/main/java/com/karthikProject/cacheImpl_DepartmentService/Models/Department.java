package com.karthikProject.cacheImpl_DepartmentService.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;


import java.util.ArrayList;

@Builder
@Slf4j
@Getter
@Setter
@Entity(name="Department")
@RequiredArgsConstructor
@AllArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Department-Name",nullable = false)
    private String name;

    @Column(name="Employee-IDs")
    private ArrayList<Integer> empId;
}
