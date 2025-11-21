package com.karthikProject.cacheImpl_DepartmentService.Service;

import com.karthikProject.cacheImpl_DepartmentService.Exception.NoDepartmantFoundException;
import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Models.DepartmentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface DepartmentService {
    DepartmentDTO mapToDTO(Department department);
    DepartmentDTO getDepartmentByID(int ID) throws NoDepartmantFoundException;
    ArrayList<Department> getDepartments();
    void save(Department department);
}
