package com.karthikProject.cacheImpl_DepartmentService.Service;

import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@Primary
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    @Cacheable
    public Department getDepartmentByID(int ID) {
        return departmentRepository.findById(ID).orElseThrow();
    }

    @Override
    @Cacheable
    public ArrayList<Department> getDepartments() {
        return (ArrayList<Department>) departmentRepository.findAll();
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }
}
