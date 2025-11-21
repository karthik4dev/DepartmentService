package com.karthikProject.cacheImpl_DepartmentService.Service;

import com.karthikProject.cacheImpl_DepartmentService.Exception.NoDepartmantFoundException;
import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import com.karthikProject.cacheImpl_DepartmentService.Models.DepartmentDTO;
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
    public DepartmentDTO mapToDTO(Department department) {
        return DepartmentDTO.builder().id(department.getId())
                .name(department.getName())
                .empId(department.getEmpId())
                .build();
    }

    @Override
    @Cacheable(cacheNames = "department")
    public DepartmentDTO getDepartmentByID(int ID) throws NoDepartmantFoundException {

        return mapToDTO(departmentRepository.findById(ID).orElseThrow(() -> new NoDepartmantFoundException("No Department found")));
    }

    @Override
    public ArrayList<Department> getDepartments() {
        return (ArrayList<Department>) departmentRepository.findAll();
    }

    @Override
    public void save(Department department) {
        departmentRepository.save(department);
    }
}
