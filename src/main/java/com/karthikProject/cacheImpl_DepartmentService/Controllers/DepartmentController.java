package com.karthikProject.cacheImpl_DepartmentService.Controllers;

import com.karthikProject.cacheImpl_DepartmentService.Exception.NoDepartmantFoundException;
import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Models.DepartmentDTO;
import com.karthikProject.cacheImpl_DepartmentService.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api-v1/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


    @GetMapping("/{id}")
    public DepartmentDTO getDepartmentById(@PathVariable int id) {
        Department dept= departmentService.getDepartmentByID(id).orElseThrow(() -> new NoDepartmantFoundException("No department found with this ID"));
        return departmentService.mapToDTO(dept);

    }

    @GetMapping("/all")
    public ArrayList<Department> getDepartments(){
        return departmentService.getDepartments();
    }

    @PostMapping("/save")
    public void save(@RequestBody Department department){
        departmentService.save(department);
    }



}
