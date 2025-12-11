package com.karthikProject.cacheImpl_DepartmentService.Service;

import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Models.DepartmentDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public interface DepartmentService {
    DepartmentDTO mapToDTO(Department department);
    Optional<Department> getDepartmentByID(int id);
    ArrayList<Department> getDepartments();
    void save(Department department);
}
