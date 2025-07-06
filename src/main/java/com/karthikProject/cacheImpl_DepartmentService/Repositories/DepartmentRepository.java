package com.karthikProject.cacheImpl_DepartmentService.Repositories;

import com.karthikProject.cacheImpl_DepartmentService.Models.Department;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface DepartmentRepository extends JpaRepository<Department,Integer> {
    @Override
    Optional<Department> findById(Integer integer);

    @Override
    List<Department> findAll();

    @Override
    <S extends Department> S save(S entity);

    @Override
    void delete(Department entity);
}
