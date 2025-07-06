package com.karthikProject.cacheImpl_DepartmentService.Controllers;

import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api-v1/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping("/{id}")
    Department getDepartmentById(@PathVariable int id){
        return departmentService.getDepartmentByID(id);
    }

    @GetMapping("/all")
    ArrayList<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @PostMapping("/save")
    void save(@RequestBody Department department){
        departmentService.save(department);
    }



}
