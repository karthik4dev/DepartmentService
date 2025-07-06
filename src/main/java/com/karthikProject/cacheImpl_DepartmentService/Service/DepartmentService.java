package com.karthikProject.cacheImpl_DepartmentService.Service;

import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface DepartmentService {
    Department getDepartmentByID(int ID);
    ArrayList<Department> getDepartments();
    void save(Department department);
}
