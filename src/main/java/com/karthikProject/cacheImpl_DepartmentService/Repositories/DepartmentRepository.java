package com.karthikProject.cacheImpl_DepartmentService.Repositories;

import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
